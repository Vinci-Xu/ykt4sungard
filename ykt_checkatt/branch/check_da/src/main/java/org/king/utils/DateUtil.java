package org.king.utils;

import org.apache.log4j.Logger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Copyright (C), 2000-2005, Kingstar Co., Ltd.
 * File name: DateUtil.java
 * Description: TODO
 * Modify History����Change Log��:
 * �������ͣ��������޸ĵȣ�   ��������       ������             �������ݼ���
 * ����  				 2006-4-29     ������
 * <p/>
 *
 * @author ������
 * @version 1.0
 * @since 1.0
 */
public class DateUtil {
    /**
     * Logger for this class
     */
    private static final Logger logger = Logger.getLogger(DateUtil.class);

    /*
      * Description: ����һ����ǰʱ�� @return String ��ʽ��yyyyMMddHHmmss @exception Modify
      * History:
      */

    public static String getNow() {
        if (logger.isDebugEnabled()) {
            logger.debug("getNow() - start"); //$NON-NLS-1$
        }

        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
                "yyyyMMddHHmmss");
        String returnString = sdf.format(new Date());
        if (logger.isDebugEnabled()) {
            logger.debug("getNow() - end"); //$NON-NLS-1$
        }
        return returnString;
    }

    /*
      * Description: �������ͷ���һ����ǰʱ�� @param partten String @return String ��ʽ��partten
      * @exception Modify History:
      */

    public static String getNow(String partten) {
        if (logger.isDebugEnabled()) {
            logger.debug("getNow() - start"); //$NON-NLS-1$
        }

        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(partten);
        String returnString = sdf.format(new Date());
        if (logger.isDebugEnabled()) {
            logger.debug("getNow() - end"); //$NON-NLS-1$
        }
        return returnString;
    }

    /*
      * Description: �õ�һ�������ʱ�� @param startTime String ��ʽ��yyyyMMddHHmmss @param
      * interval int �� @return String ��ʽ��partten @exception Modify History:
      */

    public static String getNewTime(String startTime, int interval) {
        try {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
                    "yyyyMMddHHmmss");
            Date d = sdf.parse(startTime);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(d.getTime());
            calendar.add(Calendar.SECOND, interval);
            return sdf.format(calendar.getTime());
        } catch (ParseException e) {
            return startTime;
        }
    }

    /*
      * Description: �õ�һ�������ʱ�� @param startTime String ��ʽ��yyMMddHHmmss @param
      * interval int �� @return String ��ʽ��partten @exception Modify History:
      */

    public static String getSpecialNewTime(String startTime, int interval) {
        try {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
                    "yyMMddHHmmss");
            Date d = sdf.parse(startTime);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(d.getTime());
            calendar.add(Calendar.SECOND, interval);
            return sdf.format(calendar.getTime());
        } catch (ParseException e) {
            return startTime;
        }
    }

    /*
      * Description: ����ʱ����ʽ���õ����ϼ�϶ʱ���ĵڶ���ʱ�� @param startTime String ��ʽ��partten
      * @param interval int �� @return String ��ʽ��partten @exception Modify
      * History:
      */

    public static String getNewTimes(String startTime, int interval,
                                     String partten) {
        try {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
                    partten);
            Date d = sdf.parse(startTime);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(d.getTime());
            calendar.add(Calendar.SECOND, interval);
            return sdf.format(calendar.getTime());
        } catch (ParseException e) {
            return startTime;
        }
    }

    /*
      * Description: �õ�����ʱ���ַ���֮��ļ�϶ʱ�� @param firstTime String ��ʽ��yyyyMMddHHmmss
      * @param secondTime String ��ʽ: yyyyMMddHHmmss @return long @exception
      * parseException Modify History:
      */

    public static long getIntervalTime(String firstTime, String secondTime) {
        long time = 000000000;
        try {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
                    "yyyyMMddHHmmss");
            Date f = sdf.parse(firstTime);
            Date s = sdf.parse(secondTime);
            time = f.getTime() - s.getTime();
            return time;
        } catch (ParseException e) {
            // TODO: handle exception
            return time;
        }
    }

    /*
      * Description: �Ƚ�����ʱ���ַ�����ǰ���ϵ @param firstTime String ��ʽ��yyyyMMddHHmmss
      * @param secondTime String ��ʽ: yyyyMMddHHmmss @return int |
      * firstTime=second int=0 | firstTime>secondTime int>0 | firstTime<secondTime
      * int<0 @exception Modify History:
      */

    public static int checkTimeSequence(String firstTime, String secondTime) {
        try {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
                    "yyyyMMddHHmmss");
            Date f = sdf.parse(firstTime);
            Date s = sdf.parse(secondTime);
            return f.compareTo(s);
        } catch (ParseException e) {
            // TODO: handle exception
            return 0;
        }
    }
    /*
      * Description: �Ƚ�����ʱ���ַ�����ǰ���ϵ @param firstTime String ��ʽ��yyyyMMddHHmmss
      * @param secondTime String ��ʽ: yyyyMMddHHmmss @return int |
      * firstTime=second int=0 | firstTime>secondTime int>0 | firstTime<secondTime
      * int<0 @exception Modify History:
      */

    public static int checkSpecialTimeSequence(String firstTime, String secondTime, String format) {
        try {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(format);
            Date f = sdf.parse(firstTime);
            Date s = sdf.parse(secondTime);
            return f.compareTo(s);
        } catch (ParseException e) {
            // TODO: handle exception
            return 0;
        }
    }

    /*
      * Description: �Ƚ�����ʱ���ַ�����ʱ��� @param firstTime String ��ʽ��yyyyMMddHHmmss
      * @param secondTime String ��ʽ: yyyyMMddHHmmss @param second int ��ʽ @return
      * int | firstTime+seconds=secondTime int=0 | firstTime+seconds>secondTime
      * int>0 | firstTime+seconds<secondTime int<0 @exception Modify History:
      */

    public static int checkIntervalTime(String firstTime, String secondTime,
                                        int seconds) {
        try {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
                    "yyyyMMddHHmmss");
            Date f = sdf.parse(firstTime);
            Date s = sdf.parse(secondTime);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(f.getTime());
            calendar.add(Calendar.SECOND, seconds);
            Date temp = calendar.getTime();
            return temp.compareTo(s);
        } catch (Exception e) {
            // TODO: handle exception
            return 0;
        }
    }

    public static int getDayofWeek() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    public static String reFormatTime(String time) {
        try {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
                    "yyyyMMddHHmmss");
            Date d = sdf.parse(time);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(d.getTime());
            sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            return sdf.format(calendar.getTime());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return time;
        }

    }

    /**
     * get the first day of the current week
     *
     * @param pattern .
     * @return .
     */
    public static String getFirstDayOfWeek(String pattern) {
        Calendar c = Calendar.getInstance();
        //the default first day of week is Sunday,we change it to Monday in order to accord with chinese habit
        c.setFirstDayOfWeek(Calendar.MONDAY);

        SimpleDateFormat df = new java.text.SimpleDateFormat(pattern);
        c.set(c.DAY_OF_WEEK, Calendar.MONDAY);
        return df.format(c.getTime());
    }

    /**
     * get the year after 2000
     *
     * @return .
     */
    public static List getYearList() {
        List yearList = new ArrayList();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        for(int i=2000;i<=year;i++){
            yearList.add(i);
        }
        return yearList;
    }

    public static void main(String[] arg) {

        Calendar c = Calendar.getInstance();
        c.getMinimalDaysInFirstWeek();
        System.out.println(c);

    }

}