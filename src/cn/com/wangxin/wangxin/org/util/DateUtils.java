package cn.com.wangxin.wangxin.org.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * ClassName:DateUtils
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   JohnYe
 * @version  
 * @since   
 * @Date	 Nov 9, 2012		10:08:52 AM
 *
 * @see 	 
 
 */
public class DateUtils {
	
	/**
	 * 
	 * getFormatDate:(获取带日的时间串)
	 *
	 * @param  @param date
	 * @param  @return    设定文件
	 * @return String    DOM对象
	 * @throws 
	 * @since
	 */
	public static String getFormatDate(long date){
		if(date==0)
			return "";
		else{
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			return df.format(new Date(date));
		}
	}
	/**
	 * 
	 * getFormatDateWithoutDay:(获取不带日的时间串)
	 *
	 * @param  @param date
	 * @param  @return    设定文件
	 * @return String    DOM对象
	 * @throws 
	 * @since
	 */
	public static String getFormatDateWithoutDay(long date){
		if(date==0)
			return "";
		else{
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
			return df.format(new Date(date));
			
		}
	}
	
	/**
	 * 
	 * getFormatDateTime:(获取带时间串)
	 *
	 * @param  @param date
	 * @param  @return    设定文件
	 * @return String    DOM对象
	 * @throws 
	 * @since
	 */
	public static String getFormatDateTime(long date){
		if(date==0)
			return "";
		else{
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return df.format(new Date(date));
		}
	}
	
	/**
	 * 
	 * getLongDateFromString:(转化时间)
	 *
	 * @param  @param dateString
	 * @param  @return    设定文件
	 * @return long    DOM对象
	 * @throws 
	 * @since
	 */
	public static long getLongDateFromString(String dateString){
		return getLongDateFromString(dateString,true);
	}
	
	public static long getLongDateFromString(String dateString,boolean hasDay){
		SimpleDateFormat df =  null;
		if(hasDay){
			df = new SimpleDateFormat("yyyy-MM-dd");
		}else{
			df = new SimpleDateFormat("yyyy-MM");
		}
		try {
			return df.parse(dateString).getTime();
		} catch (ParseException e) {
			e.printStackTrace();
			return 0l;
		}
	}
	
	public static long getLongDateTimeFromString(String timeString){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return df.parse(timeString).getTime();
		} catch (ParseException e) {
			e.printStackTrace();
			return 0l;
		}
	}
	
	
	public static long getLongDateMilliTimeFromString(String timeString){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		try {
			return df.parse(timeString).getTime();
		} catch (ParseException e) {
			e.printStackTrace();
			return 0l;
		}
	}
	
	public static String getFormatDateMilliTime(long time){
		String strTime = String.valueOf(time);
		String mill = strTime.substring(strTime.length()-3);
		String dateTime = getFormatDateTime(time);
		
		return dateTime+ ":" +mill;
	}
	
	//本月第一天
		public static long returnFirstDayByMonth(){
			
			Calendar ca = Calendar.getInstance();
			ca.set(GregorianCalendar.DAY_OF_MONTH, 1);   
			Date beginTime=ca.getTime();  
			SimpleDateFormat datef=new SimpleDateFormat("yyyy-MM-dd");
			String firstTime=datef.format(beginTime)+" 00:00:00"; 
			//System.out.println(firstTime);
			return getLongDateTimeFromString(firstTime);
		}
		//本月最后一天
		public static long returnLastDayByMonth(){
			Calendar ca = Calendar.getInstance();
			ca.set( Calendar.DATE, 1 );  
			ca.roll(Calendar.DATE, - 1 );  
			Date endTime=ca.getTime();  
			SimpleDateFormat datef=new SimpleDateFormat("yyyy-MM-dd"); 
			String lastTime=datef.format(endTime)+" 23:59:59";
			return getLongDateTimeFromString(lastTime);
		}
		
		/**
		 * 获取指定年月最后一天的date串
		 * @param year
		 * @param month
		 * @return 
		 */
		public static String getLastDayOfMonth(Integer year, Integer month) {
	        Calendar calendar = Calendar.getInstance();
	        if (year == null) {
	            year = calendar.get(Calendar.YEAR);
	        }
	        if (month == null) {
	            month = calendar.get(Calendar.MONTH);
	        }
	        calendar.set(year, month-1, 1);
	        calendar.roll(Calendar.DATE, -1);       
	        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");  
	        String str = sf.format(calendar.getTime());       
	        return str;
	    }
		/**
		 * 
		 *@author zzy
		 *
		 *Desc:获取不带年月日数字串
		 *
		 *@date 2014-12-23 上午10:36:58
		 *
		 * @param time
		 * @return
		 */
		public static String getNumDate(long date){
				if(date==0)
					return "19700101";
				SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
				return df.format(new Date(date));
		}
	public static void main(String[] args){
		long time = DateUtils.getLongDateTimeFromString("2014-01-01 00:00:00");
	//	long time2 = DateUtils.getLongDateMilliTimeFromString("2014-01-01 00:00:00");
//		System.out.println(DateUtils.getFormatDateWithoutDay(System.currentTimeMillis()));
//		System.out.println(DateUtils.getLongDateMilliTimeFromString("2013-03-31 24:00:00:000"));
//		long time1 = DateUtils.getLongDateTimeFromString("2013-05-13 09:46:44:789");
		//System.out.println(time);
	//	System.out.println(time2);
	//long time2 = 1406851200000l;
//		System.out.println(getFormatDateTime(new Date().getTime()));
	System.out.println(time);
	System.out.println(System.currentTimeMillis());
		
//		System.out.println(DateUtils.getFormatDateWithoutDay(System.currentTimeMillis()).split("-")[0]);
//		System.out.println(DateUtils.getFormatDateWithoutDay(System.currentTimeMillis()).split("-")[1]);
	}
}

