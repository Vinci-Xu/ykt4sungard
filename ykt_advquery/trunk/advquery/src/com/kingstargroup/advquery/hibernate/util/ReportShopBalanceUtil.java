/**
 * 
 */
package com.kingstargroup.advquery.hibernate.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.kingstargroup.advquery.common.DateUtilExtend;
import com.kingstargroup.advquery.hibernate.dao.ReportShopBalanceDAO;
import com.kingstargroup.advquery.util.WebKeys;

public class ReportShopBalanceUtil extends BasicUtil {

	/**
	 * Copyright (C), 2000-2006, Kingstar Co., Ltd.<br>
	 * File name: .java<br>
	 * Description: AccountUtil����������ϸ<br>
	 * Return: List<br>
	 * Modify History: <br>
	 * ��������    ������     ����ʱ��       ��������<br>
	 * ======================================<br>
	 *  ����      ����ΰ     2006-5-15  <br>
	 * @author   ����ΰ
	 * @version 
	 * @since 1.0
	 */
	public static List getAllConsumeStat(String beginDate,String endDate,String statType) {
		ReportShopBalanceDAO dao = ReportShopBalanceDAO.getInstance();
		List result = new ArrayList();
		try {
			List consume = dao.getAllConsumeStat(beginDate,endDate,statType);
			if ("bydate".equals(statType)){
				for (int i=0 ;i<consume.size();i++){
					Object[] objects = (Object[])consume.get(i);
					HashMap accMap = new HashMap();
					accMap.put("balance_date",objects[0]);
					accMap.put("tradeamt",objects[1]);
					accMap.put("mngamt",objects[2]);
					accMap.put("tradenum",objects[3]);
					accMap.put("week",DateUtilExtend.getWeekByDate(objects[0].toString()));
					accMap.put("sysdate",new Integer((int)DateUtilExtend.diffDate(WebKeys.sysBeginDate,objects[0].toString())+1));
					result.add(accMap);
				}
			}else{
				for (int i=0 ;i<consume.size();i++){
					Object[] objects = (Object[])consume.get(i);
					HashMap accMap = new HashMap();
					accMap.put("balance_date",objects[0]);
					accMap.put("tradeamt",objects[1]);
					accMap.put("mngamt",objects[2]);
					accMap.put("tradenum",objects[3]);
					result.add(accMap);
				}
			}
			return result;
		} catch(Exception he) {
			he.printStackTrace();
			return null;		
		} finally {
			closeSession();
		}
	}
	
	public static List getAreaSalesNumCompare(String beginDate,String endDate,String statType){
		ReportShopBalanceDAO dao = ReportShopBalanceDAO.getInstance();
		List result = new ArrayList();
		try {
			List consume = dao.getAreaSalesNumCompare(beginDate,endDate,statType);
			if ("bydate".equals(statType)){
				for (int i=0 ;i<consume.size();i++){
					Object[] objects = (Object[])consume.get(i);
					HashMap accMap = new HashMap();
					accMap.put("balance_date",objects[0]);
					accMap.put("hd",objects[1]);
					accMap.put("fl",objects[2]);
					accMap.put("zj",objects[3]);
					accMap.put("jw",objects[4]);
					accMap.put("week",DateUtilExtend.getWeekByDate(objects[0].toString()));
					accMap.put("sysdate",new Integer((int)DateUtilExtend.diffDate(WebKeys.sysBeginDate,objects[0].toString())+1));
					result.add(accMap);
				}
			}else{
				for (int i=0 ;i<consume.size();i++){
					Object[] objects = (Object[])consume.get(i);
					HashMap accMap = new HashMap();
					accMap.put("balance_date",objects[0]);
					accMap.put("hd",objects[1]);
					accMap.put("fl",objects[2]);
					accMap.put("zj",objects[3]);
					accMap.put("jw",objects[4]);
					result.add(accMap);
				}
			}
			return result;
		} catch(Exception he) {
			he.printStackTrace();
			return null;		
		} finally {
			closeSession();
		}		
	}
	public static List getAreaSalesMoneyCompare(String beginDate,String endDate,String statType){
		ReportShopBalanceDAO dao = ReportShopBalanceDAO.getInstance();
		List result = new ArrayList();
		try {
			List consume = dao.getAreaSalesMoneyCompare(beginDate,endDate,statType);
			if ("bydate".equals(statType)){
				for (int i=0 ;i<consume.size();i++){
					Object[] objects = (Object[])consume.get(i);
					HashMap accMap = new HashMap();
					accMap.put("balance_date",objects[0]);
					accMap.put("hd",objects[1]);
					accMap.put("fl",objects[2]);
					accMap.put("zj",objects[3]);
					accMap.put("jw",objects[4]);
					accMap.put("week",DateUtilExtend.getWeekByDate(objects[0].toString()));
					accMap.put("sysdate",new Integer((int)DateUtilExtend.diffDate(WebKeys.sysBeginDate,objects[0].toString())+1));
					result.add(accMap);
				}
			}else{
				for (int i=0 ;i<consume.size();i++){
					Object[] objects = (Object[])consume.get(i);
					HashMap accMap = new HashMap();
					accMap.put("balance_date",objects[0]);
					accMap.put("hd",objects[1]);
					accMap.put("fl",objects[2]);
					accMap.put("zj",objects[3]);
					accMap.put("jw",objects[4]);
					result.add(accMap);
				}
			}
			return result;
		} catch(Exception he) {
			he.printStackTrace();
			return null;		
		} finally {
			closeSession();
		}		
	}
	
	/**
	 * ��У�����ѽ��ͱ����Ա�
	 * 2006-6-2
	 * hjw
	 * @param
	 * @return
	 */
	public static List getAreaSalesCompare(String beginDate,String endDate,String statType){
		ReportShopBalanceDAO dao = ReportShopBalanceDAO.getInstance();
		List result = new ArrayList();
		try {
			List consume = dao.getAreaSalesCompare(beginDate,endDate,statType);
			if ("bydate".equals(statType)){
				for (int i=0 ;i<consume.size();i++){
					Object[] objects = (Object[])consume.get(i);
					HashMap accMap = new HashMap();
					accMap.put("balance_date",objects[0]);
					accMap.put("hdamt",objects[1]);
					accMap.put("flamt",objects[2]);
					accMap.put("zjamt",objects[3]);
					accMap.put("jwamt",objects[4]);
					accMap.put("hdnum",objects[5]);
					accMap.put("flnum",objects[6]);
					accMap.put("zjnum",objects[7]);
					accMap.put("jwnum",objects[8]);
					accMap.put("week",DateUtilExtend.getWeekByDate(objects[0].toString()));
					accMap.put("sysdate",new Integer((int)DateUtilExtend.diffDate(WebKeys.sysBeginDate,objects[0].toString())+1));
					result.add(accMap);
				}
			}else{
				for (int i=0 ;i<consume.size();i++){
					Object[] objects = (Object[])consume.get(i);
					HashMap accMap = new HashMap();
					accMap.put("balance_date",objects[0]);
					accMap.put("hdamt",objects[1]);
					accMap.put("flamt",objects[2]);
					accMap.put("zjamt",objects[3]);
					accMap.put("jwamt",objects[4]);
					accMap.put("hdnum",objects[5]);
					accMap.put("flnum",objects[6]);
					accMap.put("zjnum",objects[7]);
					accMap.put("jwnum",objects[8]);
					result.add(accMap);
				}
			}
			return result;
		} catch(Exception he) {
			he.printStackTrace();
			return null;		
		} finally {
			closeSession();
		}		
	}
	
   //	�̻�Ӫҵ���㱨��  gejinfeng 2008-09-23
	public static List getShopAccountQueryResult(String beginDate,String endDate,String shopid,String isdevice,String ismeal){
		ReportShopBalanceDAO dao = ReportShopBalanceDAO.getInstance();
		List result = new ArrayList();
		try {
			List consume = dao.getShopAccountQueryResult(beginDate,endDate,shopid,isdevice,ismeal);
			for(int i=0 ; i<consume.size() ; i++){
				Object[] objects = (Object[])consume.get(i);
				HashMap accMap = new HashMap();
				accMap.put("shopId", objects[0]);
				accMap.put("shopName", objects[1]);
				accMap.put("deptId", objects[2]);
				accMap.put("deviceId", objects[3]);
				accMap.put("deviceName", objects[4]);
				accMap.put("mealName", objects[6]);
				accMap.put("sumCount", objects[7]);
				accMap.put("sumTrade", objects[8]);
				accMap.put("sumMng", objects[9]);
				accMap.put("sumTotal", objects[10]);
				result.add(accMap);
			}
			return result;
		} catch(Exception he) {
			he.printStackTrace();
			return null;		
		} finally {
			closeSession();
		}
	}
	
    //PosӪҵ����������  gejinfeng 2008-09-23
	public static List getPosQueryResult(String beginDate,String endDate,String shopid,String isdevice,String ismeal){
		ReportShopBalanceDAO dao = ReportShopBalanceDAO.getInstance();
		List result = new ArrayList();
		try {
			List consume = dao.getPosQueryResult(beginDate,endDate,shopid,isdevice,ismeal);
			for(int i=0 ; i<consume.size() ; i++){
				Object[] objects = (Object[])consume.get(i);
				HashMap accMap = new HashMap();
				accMap.put("shopId", objects[0]);
				accMap.put("shopName", objects[1]);
				accMap.put("deptId", objects[2]);
				accMap.put("deviceId", objects[3]);
				accMap.put("deviceName", objects[4]);
				accMap.put("mealName",objects[6]);
				accMap.put("sumCount", objects[7]);
				accMap.put("sumTrade", objects[8]);
				accMap.put("sumMng", objects[9]);
				accMap.put("sumTotal", objects[10]);
				result.add(accMap);
			}
			return result;
		} catch(Exception he) {
			he.printStackTrace();
			return null;		
		} finally {
			closeSession();
		}
	}

}