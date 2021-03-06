/*************************************************************************
*	System		: POPLAR/ANZU_L
*	File Name	: LST_BATB.C
*	Author		: 桑原 美紀
*	Date		: 1997/03/11
*	RealTimeOS	: ＲＩＳＣ（ＳＨ７０４３）モニター
*	Description	: 一括送信BOXﾘｽﾄ
*	Maintenance	:
*
*	Copyright (C) 1996 Murata Machinery,Ltd. All rights reserved.
*************************************************************************/
#include	"\src\atlanta\define\product.h"
#include	"\src\atlanta\define\apl_msg.h"
#include	"\src\atlanta\define\sysdial.h"
#include	"\src\atlanta\define\std.h"
#include	"\src\atlanta\define\cmn_def.h"
#include	"\src\atlanta\define\lst_def.h"

#include	"\src\atlanta\define\cmn_pro.h"
#include	"\src\atlanta\define\lst_pro.h"
#include	"\src\atlanta\define\uni_pro.h"

#include	"\src\atlanta\ext_v\bkupram.h"
#include	"\src\atlanta\ext_v\lst_data.h"
#include	"\src\atlanta\ext_v\lst_wrd.h"

#if (PRO_PANEL == ANK)
#include	"\src\atlanta\opr\ank\define\opr_def.h"
#include	"\src\atlanta\opr\ank\define\opr_pro.h"
#include	"\src\atlanta\opr\ank\ext_v\opr_data.h"
#endif

#if (PRO_PANEL == KANJI)
#include	"\src\atlanta\opr\kanji\define\opr_def.h"
#endif

#if (PRO_OKI == ENABLE)	/* by K.Watanabe 1999/02/09 */
#include	"\src\atlanta\opr\ank\ext_v\opr_wrd0.h"
#endif

#if (PRO_BATCH_TX == ENABLE)
/*************************************************************************
	module		:[一括送信ＢＯＸリスト印刷]
	function	:[一括送信ＢＯＸリストを印刷する]
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
	date		:[94/ 3/ 7]
	author		:[豊田浩子]
*************************************************************************/
WORD					Print_BatchTxBox_List(
						 void )					/*なし*/
{
	register WORD	ret;						/*実行結果*/
	UBYTE	i;							/*loop*/

	if ( (ret = CharacterPrint( LST_OPEN )) != OK ) {
		return ( ret );
	}

	/* １行改行＋発信元名，発信元番号＋２行改行印刷＋見出し＋１行改行 */
 #if ( PRO_PANEL == KANJI ) || ( PRO_JIS_CODE == ENABLE )
	if ( (ret = Print_Head1_Common( PWRD_BatchTxBoxList_K,
	 LST_NOT,20-1 )) != OK ) {
		return ( ret );
	}

 #else
	if ( (ret = Print_Head1_Common( PWRD_BatchTxBoxList,
	  LST_XXX_TWI_XXX, 14 )) != OK ) {
		return ( ret );
	}

 #endif

	/* 現在時間 */
 #if ( PRO_PANEL == KANJI ) || ( PRO_JIS_CODE == ENABLE )
	if (( ret = CurrentTimePrint( 60 - 1 )) != OK ) {
		return ( ret );
	}
 #else
	if (( ret = CurrentTimePrint( 56 - 1 )) != OK ) {
		return ( ret );
	}
 #endif

	/* ┌─┬────┬────────┬──┐�O �S */
	Print_BatchTxBox_List_Line( 5, List.S.Print, List.S.Attribute );
	if (( ret = CharacterPrint( LST_PRINT )) != OK ) {
		return ( ret );
	}

	/* │No.│相手先名│ �Eﾌｧｸｽ番号	  │指定日時│�E */
	Print_BatchTxBox_List_Line( 6, List.S.Print, List.S.Attribute );
	if (( ret = CharacterPrint( LST_PRINT )) != OK ) {
		return ( ret );
	}

	for ( i = 0; i < SYS_BATCH_FILE_MAX; i++ ) {
		if ( SYB_BatchTxFile[i].DialNumber[0].Item != SYS_EMPTY_DIAL ) {
			/* ├─┼────┼────────┼──┤�g */
			Print_BatchTxBox_List_Line( 7, List.S.Print, List.S.Attribute );
			if (( ret = CharacterPrint( LST_PRINT )) != OK ) {
				return ( ret );
			}
			/* │99 │xxxxxxx│xxxxxxxxxxxxxxx│xxxxx│�E */
			Print_BatchTxBox_List_Line( 8, List.S.Print, List.S.Attribute );
 #if (PRO_KEYPANEL == PANEL_ANZU_L)
			CMN_UnsignedIntToASC( &List.S.Print[6-1], (UWORD)(i+OPR_BATCH_FILE_MIN), 2, ' ' );
			/*CMN_StringCopyNum( &List.S.Print[10-1], SYB_BatchTxFile[i].Name, 16 ); 1997/11/28 */
			CMN_StringCopyNumNotNULL( &List.S.Print[10-1], SYB_BatchTxFile[i].Name, 16 );
 #else
			CMN_UnsignedIntToASC( &List.S.Print[2-1], (UWORD)(i+OPR_BATCH_FILE_MIN), 2, ' ' );
			/*CMN_StringCopyNum( &List.S.Print[6-1], SYB_BatchTxFile[i].Name, 24 ); 1997/11/28 */
			CMN_StringCopyNumNotNULL( &List.S.Print[6-1], SYB_BatchTxFile[i].Name, 24 );
 #endif
			BatchTxFileDialDataToString( &SYB_BatchTxFile[i].DialNumber[0],1,List.S.Work,0 );
 #if (PRO_KEYPANEL == PANEL_ANZU_L)
			CMN_StringCopy( &List.S.Print[27-1], List.S.Work );
 #else
			CMN_StringCopy( &List.S.Print[31-1], List.S.Work );
 #endif
			/** 指定日時のセット 修正 石橋正和 94/08/03 */
			/* CriterionMinuteToDayTimeAsc( (UDWORD)((SYB_BatchTxFile[i].ProgramTime & 0x7FFFFFFFUL)/60)
						, LST_DDHHMM, List.S.Work ); */ /** For ANZU By H.Hirao 1996/02/19 */

 #if (PRO_PANEL == KANJI)
			/* ＰＯＰＬＡＲ＿ＨはＩＣＨＯＵの流用なので、ＡＮＫ系の時刻登録とは、１日のずれが生じます。
			** よって、ＩＣＨＯＵと同じ用に処理します。
			** by O.Kimoto
			*/
			CriterionMinuteToDayTimeAsc(
						(UDWORD)((SYB_BatchTxFile[i].ProgramTime & 0x7FFFFFFFUL)/60),
						LST_DDHHMM, List.S.Work );
 #else
			MinuteToDayHourMinuteAsc(
						(WORD)((SYB_BatchTxFile[i].ProgramTime & 0x7FFFFFFF)/60),
						List.S.Work, LST_DATE_HOUR_MINUTE);
 #endif

			if (SYB_BatchTxFile[i].ProgramTime & 0x80000000UL) { /** 毎日送信の場合 */
				List.S.Work[0] = ' ';
				List.S.Work[1] = '0';
			}
 #if (PRO_KEYPANEL == PANEL_ANZU_L)
			CMN_StringCopy( &List.S.Print[68-1], List.S.Work );
 #else
			CMN_StringCopy( &List.S.Print[72-1], List.S.Work );
 #endif
			if ( (ret = CharacterPrint( LST_PRINT )) != OK ) {
				return ( ret );
			}
		}
	}

	/* └─┴────┴────────┴──┘	 */
	Print_BatchTxBox_List_Line( 9, List.S.Print, List.S.Attribute );
	if (( ret = CharacterPrint( LST_PRINT )) != OK ) {
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

/*************************************************************************
	module		:[一括送信原稿／ＢＯＸリストの横区切り罫線作成]
	function	:[一括送信原稿／ＢＯＸリストの横区切り罫線を作成する。]
	common		:[]
	condition	:[
		罫線種類
		,	0 = �ｮ�｢�｢�ﾎ�｢�｢�｢─┬───────────�｢�ｲ
		,	1 = �､ NO.�､相手先名�､		   受付番号		  │
		,	2 = �ｾ�｢�｢�ﾞ�｢───┼──────�｢────�｢�ﾆ
		,	3 = �､	  �､		�､						  │
		,	4 = �ｶ�｢�｢�ﾖ�｢�｢──┴────────�｢──�｢�ｺ
		,	5 = �ｮ�｢�｢�ﾎ�｢�｢�｢─┬─────┬───�｢�ｲ
		,	6 = �､ NO.�､相手先名�､ﾀﾞｲﾔﾙ番号 │指定日時│
		,	7 = �ｾ�｢�｢�ﾞ�｢───┼───�｢─┼───�｢�ﾆ
		,	8 = �､	  �､		�､			│		  │
		,	9 = �ｶ�｢�｢�ﾖ�｢�｢──┴─────┴�｢──�｢�ｺ
	]
	commment	:[]
	return		:[なし]
	machine		:[SH7043]
	language	:[SHC]
	keyword		:[LST]
	date		:[94/ 3/ 7]
	author		:[豊田浩子]
*************************************************************************/
void					Print_BatchTxBox_List_Line( UBYTE Category		 /*罫線種類*/
						, register UBYTE *AscString						 /*印刷文字列*/
						, register UBYTE *AttString)					 /*修飾文字列*/
{
	Prn_Att_Str_Clear( AscString, AttString );
	switch ( Category ) {
		case 0 :
			/* ┌─┬────┬──────────┐�O �S 　一括送信原稿リスト　*/
			AscString[1-1] = LST_KLINE7;
			CMN_MemorySet( &AscString[2-1], 79, LST_KLINE_);
			AscString[5-1] = LST_KLINE8;
			AscString[22-1] = LST_KLINE8;
			AscString[80-1] = LST_KLINE9;
			break;
		case 1 :
			/* │No.│相手先名│�E　　受付番号　　	│�E */
			AscString[1-1] = LST_KLINEI;
			AttributeSet( &AscString[2-1], &AttString[2-1]
					, PWRD_No, LST_NOT );
			AscString[5-1] = LST_KLINEI;
			AttributeSet( &AscString[6-1], &AttString[6-1]
					, PWRD_RemoteLocation, LST_NOT ); /* 7->6 For ANZU By H.Hirao 1996/02/13 */
			AscString[22-1] = LST_KLINEI;
			AttributeSet( &AscString[45-1], &AttString[45-1]
					, PWRD_IndexNo, LST_NOT );		/* 48->45 For POPLA 97/03/11 M.Kuwahara */
			AscString[80-1] = LST_KLINEI;
			break;
		case 2 :
			/*	├─┼────┼──────────┤�g */
			AscString[1-1] = LST_KLINE4;
			CMN_MemorySet( &AscString[2-1], 79, LST_KLINE_);
			AscString[5-1] = LST_KLINE5;
			AscString[22-1] = LST_KLINE5;
			AscString[80-1] = LST_KLINE6;
			break;
		case 3 :
			/* �E│	 │�E	   │					│	 */
			AscString[1-1] = LST_KLINEI;
			AscString[5-1] = LST_KLINEI;
			AscString[22-1] = LST_KLINEI;
			AscString[80-1] = LST_KLINEI;
			break;
		case 4 :
			/* �W└─┴────┴──────────┘	 */
			AscString[1-1] = LST_KLINE1;
			CMN_MemorySet( &AscString[2-1], 79, LST_KLINE_);
			AscString[5-1] = LST_KLINE2;
			AscString[22-1] = LST_KLINE2;
			AscString[80-1] = LST_KLINE3;
			break;
		case 5 :
			/* ┌─┬────┬────────┬──┐�O �S 　一括送信ＢＯＸリスト　*/
 #if (PRO_KEYPANEL == PANEL_ANZU_L)
			AscString[5-1] = LST_KLINE7;
			CMN_MemorySet( &AscString[6-1], 70, LST_KLINE_);
			AscString[9-1] = LST_KLINE8;
			AscString[26-1] = LST_KLINE8;
			AscString[67-1] = LST_KLINE8;
			AscString[76-1] = LST_KLINE9;
 #else
			AscString[1-1] = LST_KLINE7;
			CMN_MemorySet( &AscString[2-1], 78, LST_KLINE_);
			AscString[5-1] = LST_KLINE8;
			AscString[30-1] = LST_KLINE8;
			AscString[71-1] = LST_KLINE8;
			AscString[80-1] = LST_KLINE9;
 #endif
			break;
		case 6 :
			/* │No.│相手先名│  ﾀﾞｲﾔﾙ番号	  │指定日時│�E */
 #if (PRO_KEYPANEL == PANEL_ANZU_L)
			AscString[5-1] = LST_KLINEI;
			AttributeSet( &AscString[6-1], &AttString[6-1]
					, PWRD_No, LST_NOT );
			AscString[9-1] = LST_KLINEI;
			AttributeSet( &AscString[10-1], &AttString[10-1]
					,PWRD_RemoteLocation, LST_NOT );
			AscString[26-1] = LST_KLINEI; /* 11->10 For ANZU By H.Hirao 1996/02/13 */
			AttributeSet( &AscString[38-1], &AttString[38-1]
					,PWRD_TeleNumber, LST_NOT );
			AscString[67-1] = LST_KLINEI;
			AttributeSet( &AscString[68-1], &AttString[68-1]
					,PWRD_DelyTime, LST_NOT );
			AscString[76-1] = LST_KLINEI;
 #else
			AscString[1-1] = LST_KLINEI;
			AttributeSet( &AscString[2-1], &AttString[2-1]
					, PWRD_No, LST_NOT );
			AscString[5-1] = LST_KLINEI;
			AttributeSet( &AscString[9-1], &AttString[9-1]
					,PWRD_RemoteLocation, LST_NOT );
			AscString[30-1] = LST_KLINEI;
			AttributeSet( &AscString[42-1], &AttString[42-1]
					,PWRD_TeleNumber, LST_NOT );
			AscString[71-1] = LST_KLINEI;
			AttributeSet( &AscString[72-1], &AttString[72-1]
					,PWRD_DelyTime, LST_NOT );
			AscString[80-1] = LST_KLINEI;
 #endif
			break;
		case 7 :
			/* ├─┼────┼────────┼──┤�g */
 #if (PRO_KEYPANEL == PANEL_ANZU_L)
			AscString[5-1] = LST_KLINE4;
			CMN_MemorySet( &AscString[6-1], 70, LST_KLINE_);
			AscString[9-1] = LST_KLINE5;
			AscString[26-1] = LST_KLINE5;
			AscString[67-1] = LST_KLINE5;
			AscString[76-1] = LST_KLINE6;
 #else
			AscString[1-1] = LST_KLINE4;
			CMN_MemorySet( &AscString[2-1], 78, LST_KLINE_);
			AscString[5-1] = LST_KLINE5;
			AscString[30-1] = LST_KLINE5;
			AscString[71-1] = LST_KLINE5;
			AscString[80-1] = LST_KLINE6;
 #endif
			break;
		case 8 :
				/* │	│		 │ �E			  │	 │�E */
 #if (PRO_KEYPANEL == PANEL_ANZU_L)
			AscString[5-1] = LST_KLINEI;
			AscString[9-1] = LST_KLINEI;
			AscString[26-1] = LST_KLINEI;
			AscString[67-1] = LST_KLINEI;
			AscString[76-1] = LST_KLINEI;
 #else
			AscString[1-1] = LST_KLINEI;
			AscString[5-1] = LST_KLINEI;
			AscString[30-1] = LST_KLINEI;
			AscString[71-1] = LST_KLINEI;
			AscString[80-1] = LST_KLINEI;
 #endif
			break;
		case 9:
			/* └─┴────┴────────┴──┘	 */
 #if (PRO_KEYPANEL == PANEL_ANZU_L)
			AscString[5-1] = LST_KLINE1;
			CMN_MemorySet( &AscString[6-1], 70, LST_KLINE_);
			AscString[9-1] = LST_KLINE2;
			AscString[26-1] = LST_KLINE2;
			AscString[67-1] = LST_KLINE2;
			AscString[76-1] = LST_KLINE3;
 #else
			AscString[1-1] = LST_KLINE1;
			CMN_MemorySet( &AscString[2-1], 78, LST_KLINE_);
			AscString[5-1] = LST_KLINE2;
			AscString[30-1] = LST_KLINE2;
			AscString[71-1] = LST_KLINE2;
			AscString[80-1] = LST_KLINE3;
 #endif
			break;
	}
}
#endif	/* (PRO_BATCH_TX == ENABLE) */

/*************************************************************************
	module		:[一括送信boxﾀﾞｲﾔﾙﾃﾞｰﾀ文字列変換。]
	function	:[ﾀﾞｲﾔﾙﾃﾞｰﾀを文字列に変換する。]
	common		:[
		変換先ﾌﾟﾛｸﾞﾗﾑﾃﾞｰﾀ文字列
			必要ない時は、ﾇﾙﾎﾟｲﾝﾀとする。
	]
	condition	:[]
	commment	:[
		ﾀﾞｲﾔﾙの種別を判別し、変換元ﾀﾞｲﾔﾙﾃﾞｰﾀを、１行の最大文字数を４０とした時、行番号で示される行にはいる文字列を、
		変換先ﾌﾟﾛｸﾞﾗﾑﾃﾞｰﾀ文字列にセットする。
	]
	return		:[
		１行の最大文字数を４０とした時、ﾌﾟﾛｸﾞﾗﾑﾃﾞｰﾀを全て印刷するのに
		何行必要かを返す。（１〜）
	]
	machine		:[SH7043]
	language	:[SHC]
	keyword		:[LST]
	date		:[97/02/19]
	author		:[桑原美紀]
*************************************************************************/
#define	LN	40		/*１行の文字数*/
UBYTE				BatchTxFileDialDataToString(
						 struct SYS_BatchTxDialData_t *DialData,/*変換元プログラムデータ*/
						 UBYTE	DialDataMax,					/*変換元プログラムデータ数*/
						 register UBYTE *DialString,			/*変換先プログラムデータ文字列*/
						 UBYTE	LineNumber )					/*行番号*/
{
	UBYTE	i;								/*ﾀﾞｲﾔﾙﾃﾞｰﾀ位置w*/
	UBYTE	j;								/*現在行番号w*/
	UBYTE	str_one[LN+1];					/*１行文字列w*/
	UBYTE	string[SYS_DIRECT_DIAL_MAX*2+1];/*文字列w*/
	
	i = 0;
	j = 0;
	
	CMN_MemorySet( (UBYTE *)str_one, (LN+1), NULL );
	CMN_MemorySet( (UBYTE *)DialString, (LN+1), NULL );
	
	while ( DialData[i].Item != SYS_EMPTY_DIAL && i < DialDataMax ) {
		switch ( DialData[i].Item ) {
			case SYS_DIRECT_DIAL:
				CMN_BCD_ToASC_String( (UBYTE *)string, (UBYTE *)DialData[i].FaxNumber.Direct );
				L_string_over_chk( str_one, DialString, string, &j, LineNumber
				  , LN, LST_COMMA_STR_FRONT );
				break;
			case SYS_ONETOUCH_DIAL:
#if (PRO_KEYPANEL == PANEL_ANZU_L)
				/*CMN_UnsignedIntToASC(&string[0], DialData[i].FaxNumber.Onetouch, 2, '0');1997/11/27*/
				/*string[2] 	= NULL;*/

				if ( CMN_OffsetToOnetouchCode( DialData[i].FaxNumber.Onetouch ) <= 0x7A ){ /* 変更(ANZU) 96/01/10 H.HIRAO */
					CMN_MemorySet( (unsigned char far *)string, 3, ' ' );
					string[3] = NULL;
					string[0] = '[';
					string[1] = CMN_OffsetToOnetouchCode(
					  DialData[i].FaxNumber.Onetouch );
					string[2] = ']';
				} else{																/* 'U1'〜'U2' */
					CMN_MemorySet( (unsigned char far *)string, 4, ' ' );
					string[4] = NULL;
					string[0] = '[';
					string[1] = 0x55; /* 'U'のASCIIｺ-ﾄﾞ */
					string[2] = CMN_OffsetToOnetouchCode( DialData[i].FaxNumber.Onetouch )
					 & (unsigned char)0x0F | (unsigned char)0x30; /* U1〜U8記号をつくる */
					string[3] = ']';
				}

#else	/* PANEL_POPLA_B/L/H */
 #if (PRO_PANEL == ANK)
				string[0]	= '[';
				CMN_UnsignedIntToASC( &string[1], 
									 (UWORD)(CMN_OffsetToOnetouchCode( DialData[i].FaxNumber.Onetouch ) - 0x40),
									 2, '0');
				string[3]	= ']';
 #endif
 #if (PRO_PANEL == KANJI)
		 		/* ワンタッチの表示を[]->絵文字に変更 By O.Kimoto 1998/01/22 */
				string[0]	= LCD_PICFONT;
				string[1]	= LCD_PICFONT_LOWER;
				CMN_UnsignedIntToASC( &string[2], 
									 (UWORD)(CMN_OffsetToOnetouchCode( DialData[i].FaxNumber.Onetouch ) - 0x40),
									 2, '0');
 #endif
				string[4] 	= NULL;
#endif
				L_string_over_chk( str_one, DialString, string, &j, LineNumber
				  , LN, LST_COMMA_STR_FRONT );
				break;
			case SYS_SPEED_DIAL:
				if (( SYS_SPEED_DIAL_MAX+SYS_2ND_SPEED_DIAL_MAX ) >= 100 ) {
#if (PRO_OKI == ENABLE)	/* 海外では短縮等の頭文字が英語と違うので、変更できるようにします by K.Watanabe 1999/02/09 */
					string[0] = *CalculateStringAddress(&D2W_HeadCharacter_Speed);
#else
					string[0] = 'S';
#endif
#if (1) /* 任意短縮４桁化 2002/02/13 By M.Maeda */
					if (CHK_UNI_OptionalSpeedDial() != 0){	/* 任意短縮の時 */
						if (GetRecordFromNumber((UWORD)DialData[i].FaxNumber.Speed) != 0xFFFF) {
							CMN_UnsignedIntToASC((UBYTE*)&string[1], GetRecordFromNumber((UWORD)DialData[i].FaxNumber.Speed), OP_SPEED_FIGURE_MAX, '0');
						}
						else {
							CMN_MemorySet((UBYTE*)&string[1], OP_SPEED_FIGURE_MAX, '*');
						}
						string[1 + OP_SPEED_FIGURE_MAX] = NULL;
					}
					else{	/* 通常の短縮の時 */
						CMN_UnsignedIntToASC((UBYTE*)&string[1], DialData[i].FaxNumber.Speed+(OPR_SPEED_DIAL_MIN), 3, '0');
						string[4] = NULL;
					}
#else
//					if( CHK_UNI_OptionalSpeedDial() != 0 ){	/* 任意短縮の時 */
//						if ( GetRecordFromNumber( (UWORD)DialData[i].FaxNumber.Speed ) != 0xFFFF ) {
//							CMN_UnsignedIntToASC( (UBYTE *)&string[1],
//							  GetRecordFromNumber((UWORD)DialData[i].FaxNumber.Speed), 3, '0' );
//						}
//						else {
//							CMN_MemorySet( (UBYTE *)&string[1], 3,'*' );
//						}
//					}
//					else{	/* 通常の短縮の時 */
//						CMN_UnsignedIntToASC( (UBYTE *)&string[1],
//						  DialData[i].FaxNumber.Speed+(OPR_SPEED_DIAL_MIN), 3, '0' );
//					}
//					string[4] = NULL;
#endif
				}
				else {
					string[0] = '(';
					if( CHK_UNI_OptionalSpeedDial() != 0 ){	/* 任意短縮の時 */
						if ( GetRecordFromNumber( (UWORD)DialData[i].FaxNumber.Speed ) != 0xFFFF ) {
							CMN_UnsignedIntToASC( (UBYTE *)&string[1],
							  GetRecordFromNumber((UWORD)DialData[i].FaxNumber.Speed), 2, '0' );
						}
						else {
							CMN_MemorySet( (UBYTE *)&string[1], 3,'*' );
						}
					}
					else{		/* 通常の短縮の時 */
						CMN_UnsignedIntToASC( (UBYTE *)&string[1],
						  DialData[i].FaxNumber.Speed+(OPR_SPEED_DIAL_MIN), 2, '0' );
					}
					string[3] = NULL;
				}
				L_string_over_chk( str_one, DialString, string, &j, LineNumber
				  , LN, LST_COMMA_STR_FRONT );
				break;

			case SYS_GROUP_DIAL:
				string[0] = 'G';
				CMN_UnsignedIntToASC_NULL( (UBYTE *)&string[1],
				  DialData[i].FaxNumber.Group, 0, 0 );
				L_string_over_chk( str_one, DialString, string, &j, LineNumber
				  , LN, LST_COMMA_STR_FRONT );
				break;
		}
		i++;
	}
	return ( (UBYTE)( j+1 ) );
}
#undef	LN

