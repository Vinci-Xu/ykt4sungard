/*************************************************************************
*	System		: POPLAR/ANZU_L
*	File Name	: LST_DBAT.C
*	Author		: 桑原 美紀
*	Date		: 1997/03/11
*	RealTimeOS	: ＲＩＳＣ（ＳＨ７０４３）モニター
*	Description	: 一括送信原稿消去通知
*	Maintenance	: 
*
*	Copyright (C) 1996 Murata Machinery,Ltd. All rights reserved.
*************************************************************************/
#include	"\src\atlanta\define\product.h"
#include	"\src\atlanta\define\apl_msg.h"
#include	"\src\atlanta\define\std.h"

#include	"\src\atlanta\define\cmn_def.h"
#include	"\src\atlanta\define\lst_def.h"

#include	"\src\atlanta\define\cmn_pro.h"
#include	"\src\atlanta\define\lst_pro.h"

#include	"\src\atlanta\ext_v\bkupram.h"
#include	"\src\atlanta\ext_v\lst_data.h"
#include	"\src\atlanta\ext_v\lst_wrd.h"

#if ( PRO_PANEL == ANK )
#include "\src\atlanta\opr\ank\define\opr_def.h"
#endif
#if ( PRO_PANEL == KANJI )
#include "\src\atlanta\opr\kanji\define\opr_def.h"
#endif

#if (PRO_BATCH_TX == ENABLE)

/*************************************************************************
	module		:[一括送信原稿消去通知印刷]
	functiom	:[一括送信原稿消去通知を印刷する]
	common		:[
		List				:
		SYB_BatchTxFile		:
	]
	condition	:[]
	commment	:[]
	return		:[印刷結果]
	machine		:[SH7043]
	language	:[SHC]
	keyword		:[LST]
	date		:[94/ 3/15]
	author		:[豊田浩子]
*************************************************************************/
WORD				Print_DelBatchTxDoc_Notice(
						 void )						/*なし*/
{
	UBYTE			BoxNo;		/*一括送信BoxNo.*/
	register WORD	ret;		/*実行結果*/
	UBYTE			i;			/*roop*/

	if ( Check_AnyList( LST_DELBATCHTXDOC_NOTICE ) == MSG_PRN_LST_NO_LIST ) {
		return ( MSG_PRN_LST_NO_LIST );
	}

	if ( (ret = CharacterPrint( LST_OPEN )) != OK ) {
		return ( ret );
	}

	/* 1行改行＋発信元名，番号印刷＋２行改行 */
	if ( (ret = TTI_ID_Print_Feed() ) != OK ) {
		return ( ret );
	}

	/* ┌──────────────┐ */
	Prn_Att_Str_Clear( List.S.Print, List.S.Attribute );
	List.S.Print[18-1] = LST_KLINE7;
	CMN_MemorySet( &List.S.Print[19-1], 43, LST_KLINE_ );
	List.S.Print[62-1] = LST_KLINE9;
	if ( (ret = CharacterPrint( LST_PRINT )) != OK ) {
		return ( ret );
	}

	/* │　　一括送信原稿消去通知　　│ */
	Prn_Att_Str_Clear( List.S.Print, List.S.Attribute );
	List.S.Print[18-1] = LST_KLINEI;

#if ( PRO_PANEL == KANJI ) || ( PRO_JIS_CODE == ENABLE )
		AttributeSet( &List.S.Print[20-1], &List.S.Attribute[20-1],
		  PWRD_EraseBatchTxDoc_K, LST_NOT );		/* MES→INV 94.7.20 -> NOT 8.10 */
#else
	AttributeSet( &List.S.Print[20-1], &List.S.Attribute[20-1],
	  PWRD_EraseBatchTxDoc, LST_MES_TWI_XXX );
#endif

	List.S.Print[62-1] = LST_KLINEI;
	if ( (ret = CharacterPrint( LST_PRINT )) != OK ) {
		return ( ret );
	}

	/* └──────────────┘ */
	Prn_Att_Str_Clear( List.S.Print, List.S.Attribute );
	List.S.Print[18-1] = LST_KLINE1;
	CMN_MemorySet( &List.S.Print[19-1], 43, LST_KLINE_ );
	List.S.Print[62-1] = LST_KLINE3;
	if ( (ret = CharacterPrint( LST_PRINT )) != OK ) {
		return ( ret );
	}

	/* １行改行 */
	if ( (ret = CharacterPrint( LST_LINE_FEED )) != OK ) {
		return ( ret );
	}

	/* 現在時間 */
	if ( (ret = CurrentTimePrint( 60-1 ) ) != OK ) {
		return ( ret );
	}

	/* ┌─┬────┬──────────┐�O �S 　一括送信原稿リスト　*/
	Print_BatchTxBox_List_Line( 0, List.S.Print, List.S.Attribute );
	if (( ret = CharacterPrint( LST_PRINT )) != OK ) {
		return ( ret );
	}

	/* │No.│相手先名│�E　　受付番号　　	│�E */
	Print_BatchTxBox_List_Line( 1, List.S.Print, List.S.Attribute );
	if (( ret = CharacterPrint( LST_PRINT )) != OK ) {
		return ( ret );
	}

	/* 一括送信原稿消去リストの１行明細 */
	for ( BoxNo = OPR_BATCH_FILE_MIN; BoxNo <= SYS_BATCH_FILE_MAX; BoxNo++ ) {
		if ( SYB_BatchTxFile[BoxNo-1].Status == SYS_CMD_POWER_OFF ) {
			/*	├─┼────┼──────────┤�g */
			Print_BatchTxBox_List_Line( 2, List.S.Print, List.S.Attribute );
			if (( ret = CharacterPrint( LST_PRINT )) != OK ) {
				return ( ret );
			}

			/*�E│ 9 │xxxxxxx│xxxxxxxxxxxxxxxxxxxx│	 */
			Print_BatchTxBox_List_Line( 3, List.S.Print, List.S.Attribute);
			CMN_UnsignedIntToASC( &List.S.Print[2-1], BoxNo, 1, '0' );
			CMN_StringCopy( &List.S.Print[6-1], SYB_BatchTxFile[BoxNo-1].Name );
			if ( ( ret = Print_BatchTxDoc_Index_Specifi( BoxNo )) != OK ) {
				return ( ret );
			}
		}
	}

	/* �W└─┴────┴──────────┘	 */
	Print_BatchTxBox_List_Line( 4, List.S.Print, List.S.Attribute );
	if (( ret = CharacterPrint( LST_PRINT )) != OK ) {
		return ( ret );
	}
	for ( i = 0; i < SYS_COM_FILE_MAX; i++ ) {
		if ( SYB_BatchTxFile[i].Status == SYS_CMD_POWER_OFF ) {
			SYB_BatchTxFile[i].Status = SYS_CMD_EMPTY;
		}
	}

	/*１行印字（改行）*/
	if ( (ret = CharacterPrint( LST_LINE_FEED )) != OK ) {
		return ( ret );
	}

	/* 一括送信原稿が消去されました．．．．．． */
	Prn_Att_Str_Clear( List.S.Print, List.S.Attribute );
	AttributeSet( &List.S.Print[2-1], &List.S.Attribute[2-1],
	  PWRD_BatchTxDocErase, LST_NOT );
	if ( (ret = CharacterPrint( LST_PRINT )) != OK ) {
		return ( ret );
	}

	/*１行印字（改行）*/
	if ( (ret = CharacterPrint( LST_LINE_FEED )) != OK ) {
		return ( ret );
	}

	if ( (ret = CharacterPrint( LST_CLOSE )) != OK ) {
		return ( ret );
	}
	return ( OK );
}

#endif
