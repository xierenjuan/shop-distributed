package com.test.common.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	public static String strDefault = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 获取传入日期的00:00:00
	 * @param start 如2010-11-11 11:11:11
	 * @return 如2010-11-11 00:00:00
	 */
	public static Date getStartDate(Date start){
		Calendar calendarStart = Calendar.getInstance();
        calendarStart.setTime(start);
        calendarStart.set(calendarStart.get(Calendar.YEAR),
                        calendarStart.get(Calendar.MONTH),
                        calendarStart.get(Calendar.DATE), 
                        0, 0, 0);
        Date d = calendarStart.getTime();
        return d;
	}

	/**
	 * 获取传入日期的23:59:59
	 * @param end  如 2010-11-11 11:11:11
	 * @return  如  2010-11-11 23:59:59
	 */
	public static Date getEndDate(Date end){
		Calendar calendarStart = Calendar.getInstance();
        calendarStart.setTime(end);
        calendarStart.set(calendarStart.get(Calendar.YEAR),
                        calendarStart.get(Calendar.MONTH),
                        calendarStart.get(Calendar.DATE),
                        23, 59, 59);
        Date d = calendarStart.getTime();
        return d;
	}

	/**
	 *	获取年月日 时分的字符串
	 */
	public static String getYMDHS(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String format = sdf.format(new Date().getTime());
		return format;
	}

	/**
	 * 获取当前日期，  如：2019/12/12
	 * @return
	 */
	public static String getCurrentYMD(){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String dateNowStr = sdf.format(d);
		return dateNowStr;
	}

	/**
	 * 获取前一天日期
	 * @return
	 */
	public static String getPreYMD(){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		Date date0 = getStartDate(calendar.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String dateNowStr = sdf.format(date0);
		return dateNowStr;
	}

	/**
	 *  获取传入日期的前一天的0点
	 * @param date  如2010-11-11 11：11:11
	 * @return  2010-11-10 00:00:00
	 */
	public static Date getPreDay0Date(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		Date date0 = getStartDate(calendar.getTime());
		return date0;
	}
	/**
	 *  获取传入日期的前一天的23点59分59秒
	 * @param date  如2010-11-11 11：11:11
	 * @return  2010-11-10 23:59:59
	 */
	public static Date getPreDay24Date(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		Date date24 = getEndDate(calendar.getTime());
		return date24;
	}


	/**
	 * 获取几个月之前或者之后的此时此刻
	 * @param sourceDate
	 * @param month   正：几个月后的此时，负：几个月前的此时
	 * @return
	 */
	public static Date stepMonth(Date sourceDate, int month) {
		Calendar c = Calendar.getInstance();
		c.setTime(sourceDate);
		c.add(Calendar.MONTH, month);

		return c.getTime();
	}

	/**
	 * 获取两个日期相差天数
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static int getDaysBetween(Date startDate, Date endDate) {
		Calendar fromCalendar = Calendar.getInstance();
		fromCalendar.setTime(startDate);
		fromCalendar.set(Calendar.HOUR_OF_DAY, 0);
		fromCalendar.set(Calendar.MINUTE, 0);
		fromCalendar.set(Calendar.SECOND, 0);
		fromCalendar.set(Calendar.MILLISECOND, 0);

		Calendar toCalendar = Calendar.getInstance();
		toCalendar.setTime(endDate);
		toCalendar.set(Calendar.HOUR_OF_DAY, 0);
		toCalendar.set(Calendar.MINUTE, 0);
		toCalendar.set(Calendar.SECOND, 0);
		toCalendar.set(Calendar.MILLISECOND, 0);

		return (int) ((toCalendar.getTime().getTime() - fromCalendar.getTime().getTime()) / (1000 * 60 * 60 * 24));
	}

	/**
	 * 获取上个月第一天的第一时间，如： Sun Apr 01 00:00:00 CST 2018
	 * @return
	 */
	public static Date getLastMonthFirstDay(){
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, -1);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		return calendar.getTime();
	}

	/**
	 * 获取上个月最后一天的最后时间，如： Mon Apr 30 23:59:59 CST 2018
	 * @return
	 */
	public static Date getLastMonthFinalDay(){
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.add(Calendar.DATE, -1);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		return calendar.getTime();
	}

	/**
	 * 获取上周第一天时间，如：Mon May 21 00:00:00 CST 2018
	 * @return
	 */
	public static Date getLastWeekFirstDay(){
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		cal.add(Calendar.DAY_OF_WEEK, -7);
		return cal.getTime();
	}

	 /**
	 * 获取上周最后一天最后时间，如： Sun May 27 23:59:59 CST 2018
	 * @return
	 */
	public static Date getLastWeekFinalDay(){
		Calendar calendar = Calendar.getInstance();
		Date lastWeekFirstDay = getLastWeekFirstDay();
		calendar.setTime(lastWeekFirstDay);
		calendar.add(Calendar.DAY_OF_WEEK, 6);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		return calendar.getTime();
	}

	public static String dateToString(Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat(strDefault);
		String dateString = formatter.format(date);
		return dateString;
	}
}
