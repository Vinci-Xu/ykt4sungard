/* --------------------------------------------
 * ��������: F930030.cpp
 * ��������: 1 31 2007
 * ��������: ����
 * �汾��Ϣ: 1.0.0.0
 * ������: ˮ��ת�ʻ���ת����ˮ����
 * --------------------------------------------*/

#define _IN_SQC_
#include <stdio.h>
#include <string.h>
#include "pubdef.h"
#include "errdef.h"
#include "pubfunc.h"
#include "pubdb.h"
#include "dbfunc.h"
#include "acctrans.h"
#include "busqc.h"

static int check(T_t_posdtl *p) {
    int ret = 0;
    if (0 == strlen(p->crc))
        return E_999_CRC;                           //�ϴ���ˮCRCУ�����

    ret = IsInvalidDateTime(p->transdate, "YYYYMMDD");
    if (ret)
        return E_999_DATE;                          //�ϴ���ˮ������������

    ret = IsInvalidDateTime(p->transtime, "HHMMSS");
    if (ret)
        return E_999_TIME;                          //�ϴ���ˮ����ʱ������

    if ((p->transmark != 0x99) && (p->transmark != 0xFE) && (p->transmark != 0x90))
        return p->transmark + E_999_0X00;             //�ѷ�������Ϊ���ױ��

    if(p->cardbefbal - p->cardaftbal != p->amount)
        return E_999_CARD_BALANCE;				  //�ϴ���ˮ���뿨�������

    if (0X99 == p->transmark) {
        if (p->amount <= 0)                        //�ϴ���ˮ���׷����������
            return E_999_AMT;
    }
    /*
    else
    {
        if (p->amount <= 0)
           return E_999_AMT;                      //�ϴ���ˮ���׷����������
    }
    */
    if (0x90 == p->transmark) {
        if (p->amount <= 0)
            return E_999_AMT;
    }
    return 0;
}

int F930030(TRUSERID *handle,int iRequest,ST_PACK *rPack,int *pRetCode,char *szMsg) {
    int ret = 0;
    T_t_posdtl posdtl;

    memset(&posdtl, 0, sizeof(posdtl));

    posdtl.devseqno = rPack->lvol4;                       //�ϴ�����ˮ��
    posdtl.transmark = rPack->lvol12;                        //999���ױ��
    posdtl.sysid = rPack->lcert_code;                     //�ϴ�����վ��ʶ
    des2src(posdtl.devphyid, rPack->sdate1);               //�����豸ID
    des2src(posdtl.inpower_no, rPack->stx_pwd);             //�ն��豸��Ȩ��
    posdtl.comu_ver = rPack->lbank_acc_type;               //ͨ�Ű汾��
    int ver = posdtl.comu_ver / 10;
    if (0x81 == posdtl.comu_ver || 0x81 == ver)
        posdtl.fee_code = rPack->lbank_acc_type2;
    else
        posdtl.fee_code = 0;
    des2src(posdtl.crc, rPack->sbank_code2);                //CRCЧ��
    posdtl.cardno = rPack->lvol5;                         //���׿���
    posdtl.purseno = rPack->lvol6;                        //����Ǯ����
    posdtl.cardbefbal = rPack->lvol9;                         //�뿨���
    posdtl.cardaftbal = rPack->lvol10;                       //�������
    posdtl.amount = rPack->lvol8;                          //�������ѽ��
    posdtl.cardcnt = rPack->lvol7;                       //��ǰ�����ʻ����Ѵ���
    posdtl.transcode = 930030;                               //���״���
    snprintf(posdtl.transdate, 9, "20%s", rPack->spost_code);//��������(��ʽ�����������)
    des2src(posdtl.transtime,rPack->spost_code2);			   //����ʱ��(��ʽ�������ʱ��)
    getsysdate(posdtl.coldate);
    ret = check(&posdtl);
    if (ret) {
        posdtl.errcode = ret;
        if (2 == posdtl.transmark)
            posdtl.status[0] = '6';                        //��;�ο�
        else {
            posdtl.status[0] = '5';
            strncpy(posdtl.accdate, posdtl.coltimestamp, 8);
            strncpy(posdtl.acctime, posdtl.coltimestamp + 8, 6);
        }
    } else
        posdtl.status[0] = '1';
    g_dbchkerr = 0;
    ret = DB_t_posdtl_add(&posdtl);
    if (ret) {
        g_dbchkerr = 1;
        writelog(LOG_DEBUG,"serial_no[%d]cardno[%d]deviceid[%s]transdate[%s]transtime[%s]",posdtl.devseqno,posdtl.cardno,posdtl.devphyid,posdtl.transdate,posdtl.transtime);
        if (DB_REPEAT == ret)
            return 0;
        else
            *pRetCode = E_DB_TRADESERIAL_I;
        goto L_RETU;
    }
    g_dbchkerr = 1;
    return 0;
L_RETU:
    return -1;
}