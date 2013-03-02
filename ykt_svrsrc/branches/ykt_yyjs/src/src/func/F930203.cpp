/* --------------------------------------------
 * ��������: F930203.sqc
 * ��������: 2007-04-23
 * ��������: ����
 * �汾��Ϣ: 1.0.0.0
 * ������: �ɼ��Ž���ˮ���¼�
 * --------------------------------------------*/
#define _IN_SQC_
#include <string.h>
#include <stdio.h>
#include "pubfunc.h"
#include "pubdb.h"
#include "pubdef.h"
#include "errdef.h"
#include "dbfunc.h"
#include "fdsqc.h"
#include "dbfunc_foo.h"

static int ConverPhyNo(char *physical_no_hex, char *physical_no_dec)
{
	char tmp[8+1] = "";
	int i = 0;
	char a1[3] = "";
	char a2[3] = "";
	char a3[3] = "";
	char a4[3] = "";

	memcpy(a1, physical_no_hex, 2);
	memcpy(a2, physical_no_hex + 2, 2);
	memcpy(a3, physical_no_hex + 4, 2);
	memcpy(a4, physical_no_hex + 6, 2);

	sprintf(tmp, "%s%s%s%s", a4, a3, a2, a1);
	sscanf(tmp, "%8X", &i);
	sprintf(physical_no_dec, "%d", i);
	return 0;
}


int F930203(TRUSERID *handle, int iRequest, ST_PACK *in_pack, int *pRetCode, char *szMsg)
{
	T_t_door_txdtl txdtl;
	T_t_pif_card tCard;
	T_t_pif_device device;
	T_t_door_events event;
	int ret;
	char weigand_no[12+1] = "";
	memset(&device, 0, sizeof device);
	// ��ѯ�豸ID��
	if (in_pack->lvol5 > 0)
	{
		ret = DB_t_pif_device_read_by_device_id(in_pack->lvol5, &device);
	}
	else
	{
		// ���ж��ǲ����и��豸ID
		if (in_pack->lvol2 > 0)
			ret = get_door_dev_by_parent_and_termid(&device, in_pack->lvol2
			                                        , in_pack->lvol1); // ͨ�����Ų�ѯ
		else
		{
			// �жϸ��豸����
			if (in_pack->lvol3 > 0)
				ret = find_device_by_parent_termid(&device, in_pack->lvol3, in_pack->lvol1
				                                   , in_pack->lserial0); // ͨ�����豸�������豸���Ų�ѯ
			else
			{
				// ͨ����ϵͳ�����豸���Ų�ѯ
				ret = find_device_by_devinfo(&device, in_pack->lcert_code, in_pack->lvol1
				                             , in_pack->sbank_code, 1001);//in_pack->lserial0);
			}
		}
	}
	if (ret)
	{
		writelog(LOG_ERR, "get_door_dev_by_parent_and_termid err,device[=%d]parent_id=[%d],dev_no=[%d],ret=[%d]",
		         in_pack->lvol5, in_pack->lvol2, in_pack->lvol1, ret);
		if (ret == E_DB_DEVICE_N)
		{
			writelog(LOG_ERR, "�ϴ���¼�Ҳ�����Ӧ���豸termid[%d]type[%s]parent[%d][%d],sys[%d],phytype[%d]"
			         , in_pack->lvol1, in_pack->sbank_code, in_pack->lvol2, in_pack->lvol3, in_pack->lcert_code, in_pack->lserial0);
			//return 0;
			*pRetCode = ret;
			goto L_RETU;
		}
		else
		{
			*pRetCode = ret;
			goto L_RETU;
		}
	}
	// û����������
	if (strlen(in_pack->sdate1) == 0)
	{
		//�¼�
		memset(&event, 0, sizeof event);
		event.device_id = device.device_id;
		event.event_code = atoi(in_pack->semp_no);
		des2src(event.event_msg, in_pack->vsmess);
		event.sysid = in_pack->lcert_code;
		des2src(event.tx_date, in_pack->sdate0);
		des2src(event.tx_time, in_pack->stime0);
		getsysdate(event.col_date);
		getsystime(event.col_time);
		ret = DB_t_door_events_add(&event);
		if (ret)
		{
			if (DB_REPEAT == ret)	return 0;
			*pRetCode = E_DB_DOOR_TXDTL_I;
			goto L_RETU;
		}
		return 0;

	}
	else
	{
		memset(&tCard, 0, sizeof tCard);
		ret = get_card_by_phyno(&tCard, in_pack->sdate1);
		if (ret)
		{
			if (ret == E_DB_CARD_N)
			{
				ConverPhyNo(in_pack->sdate1, weigand_no);
				ret = get_card_by_weigand_no(&tCard, weigand_no);
				if (ret)
				{
					writelog(LOG_ERR, "Get_card_by_weigand_no err,weigand_no=[%s],ret=[%d]", weigand_no, ret);
					// û�����ſ�,��Ȼ������ˮ
					if (ret != E_DB_CARD_N)
					{
						*pRetCode = ret;
						goto L_RETU;
					}
				}
			}
			else
			{
				*pRetCode = ret;
				goto L_RETU;
			}
		}
		memset(&txdtl, 0, sizeof txdtl);
		txdtl.device_id = device.device_id;
		txdtl.card_no = tCard.card_id;
		txdtl.sys_id = in_pack->lcert_code;
		txdtl.cust_id = tCard.cosumer_id;
		if (!ret)	des2src(txdtl.phycard_no, tCard.physical_no);
		else des2src(txdtl.phycard_no, in_pack->sdate1);
		//writelog(LOG_DEBUG,"door serial date[%s] time[%s]",in_pack->sdate0,in_pack->stime0);
		des2src(txdtl.tx_date, in_pack->sdate0);
		des2src(txdtl.tx_time, in_pack->stime0);
		getsysdate(txdtl.col_date);
		getsystime(txdtl.col_time);
		txdtl.tx_mark = atoi(in_pack->semp_no);
		// �����Ž���ˮ
		ret = DB_t_door_txdtl_add(&txdtl);
		if (ret)
		{
			// �ظ���ˮ����
			if (DB_REPEAT == ret)
			{
				writelog(LOG_DEBUG, "��ˮ�ظ�card[%s],date[%s],time[%s]", in_pack->sdate1
				         , in_pack->sdate0, in_pack->stime0);
				return 0;
			}
			writelog(LOG_ERR, "������ˮʧ��card[%s],date[%s],time[%s]", in_pack->sdate1
			         , in_pack->sdate0, in_pack->stime0);
			*pRetCode = E_DB_DOOR_TXDTL_I;
			goto L_RETU;
		}
		switch (device.dev_usage)
		{
		case DU_JSB_CONFRENCE:
			/*
			ret = SaveDoorJSBSerial(&txdtl);
			if(ret)
			{
				writelog(LOG_ERR,"�����ʱ����ˮʧ��,errcode[%d]",ret);
				break;
			}
			ret = UpdateConferSerial(&txdtl);
			*/
			break;
		case DU_JSB_ATTENDANCE:
			ret = SaveKQSerial(&txdtl);
			if (ret)
			{
				writelog(LOG_ERR, "���뿼����ˮ��ʧ��,errcode[%d]", ret);
				break;
			}
		default:
			//ret = SaveDoorJSBSerial(&txdtl);
			break;
		}
		if (ret)
		{
			*pRetCode = ret;
			goto L_RETU;
		}
	}
	return 0;

L_RETU:
	return -1;

}
