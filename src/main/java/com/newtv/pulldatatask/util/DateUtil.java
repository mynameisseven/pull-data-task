package com.newtv.pulldatatask.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * 时间工具类
 * @author caomenglong
 * @date 2017年6月6日 下午5:57:12
 */
public class DateUtil {

	/**
	 * 毫秒时间(单位毫秒)；
	 */
	public final static long MILLISECOND = 1L;
	/**
	 * 秒(单位毫秒)；
	 */
	public final static long SECONDETIME = 1000 * MILLISECOND;
	/**
	 * 分钟(单位毫秒)；
	 */
	public final static long MINUTETIME = 60 * SECONDETIME;
	/**
	 * 小时(单位毫秒)；
	 */
	public final static long HOURTIME = 60 * MINUTETIME;
	/**
	 * 天(单位毫秒)
	 */
	public final static long DAYTIME = HOURTIME * 24;
	/**
	 * 日期模板 yyyy-MM-dd
	 */
	public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

	private final static Logger logger = LoggerFactory.getLogger(DateUtil.class);
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static SimpleDateFormat daySDF = new SimpleDateFormat("yyyy-MM-dd");
	
	private static SimpleDateFormat day = new SimpleDateFormat("yyyy.MM.dd");

	private static SimpleDateFormat mSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

	private static SimpleDateFormat timeSDF = new SimpleDateFormat("HH:mm:ss");
	private static SimpleDateFormat daySDFt = new SimpleDateFormat("yyyyMMdd");
	
	private static SimpleDateFormat daySDFM = new SimpleDateFormat("yyyyMM");

	public static String getStringDate(Date date) {
		return sdf.format(date);
	}

	public static String getDayStringDate(Date date) {
		return daySDF.format(date);
	}
	public static String getMinuteStringDate(Date date) {
		return mSdf.format(date);
	}
	
	public static String getDayForStringDate(Date date) {
		return day.format(date);
	}

	public static String getNowStringDate() {
		return sdf.format(new Date());
	}

	public static String getNowStringDateOnleDate() {
		return daySDF.format(new Date());
	}
	
	public static String getDayStringDatet(Date date) {
		return daySDFt.format(date);
	}
	public static String getMonthStringDatet(Date date) {
		return daySDFM.format(date);
	}

	public static Date getDateByString(String date) {
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			logger.error("{}日期格式有误{}", date, "yyyy-MM-dd HH:mm:ss");
			return null;
		}
	}
	
	public static Date getDateByStringOnlyDay(String days) {
		try {
			return daySDF.parse(days);
		} catch (ParseException e) {
			e.printStackTrace();
			logger.error("{}日期格式有误{}", days, "yyyy-MM-dd");
			return null;
		}
	}

	public static Date getDateByStringOnlyTimes(String times) {
		try {
			return timeSDF.parse(times);
		} catch (ParseException e) {
			e.printStackTrace();
			logger.error("{}日期格式有误{}", times, "HH:mm:ss");
			return null;
		}
	}

	/**
	 * 取当前时间
	 */
	public static Date getCurrentDate() {
		try {
			return new Date(System.currentTimeMillis());
		} catch (Exception e) {
			logger.error("DateUtil getCurrentDate()");
		}
		return null;
	}

	/**
	 * 判断时间 true：是今天 false：不是今天
	 */
	public static boolean isToday(String date) {
		Date today = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		return format.format(today).equals(date);
	}
	
	/**
	 * 取得当前时间与指定时间相差多少天
	 * 
	 * @param oldDate
	 * @return
	 */
	public static long getDayNum(long oldDate){
		long nowDay = System.currentTimeMillis() / 1000l / 60 / 60;
		long oldDay = oldDate / 1000l / 60 / 60;
		long overDay = nowDay - oldDay + 1;
		return overDay;
	}
	
	/**
	 * 当前时间加上指定的分钟后，是否跨天
	 * 
	 * @param minute
	 * @return
	 */
	public static boolean isOverToday(int minute) {
		long addMillis = minute * MINUTETIME;
		long currTime = System.currentTimeMillis();
		Calendar c = Calendar.getInstance(Locale.CHINA);
		// 加上这段时间后的日期是一年中的第几天
		c.setTimeInMillis(currTime + addMillis);
		int currDay = c.get(Calendar.DAY_OF_YEAR);
		// 当前时间是一年中的第几天
		c.setTimeInMillis(currTime);
		return currDay == c.get(Calendar.DAY_OF_YEAR);
	}

	/**
	 * 判断两个时间是否跨天
	 * 
	 * @param currTime
	 * @param oldTime
	 * @return
	 */
	public static boolean isOverDay(long currTime, long oldTime) {
		long currDay = currTime / 1000l / 60l / 60 / 24;
		long oldDay = oldTime / 1000l / 60l / 60 / 24;
		if (oldDay >= currDay) {
			// 这有可能吗？
			return false;
		}
		return true;
	}

	/**
	 * 取得指定时间所在天的23:30
	 * 
	 * @param currTime
	 * @return
	 */
	public static long getDayOver(long currTime) {
		Calendar c = Calendar.getInstance(Locale.CHINA);
		c.set(Calendar.HOUR_OF_DAY, 23);
		c.set(Calendar.MINUTE, 30);
		return c.getTimeInMillis();
	}

	/**
	 * 判断2个时间相差几天, oleTime 当成第一天
	 * 
	 * @param currTime
	 *            当前时间
	 * @param oldTime
	 *            目标时间
	 * @return 返回相差几天,如果oldTime > currTime;返回0
	 */
	public static int getDayInterval(long currTime, long oldTime) {
		int intervalDay = 0;
		if (currTime < oldTime) {
			return 0;
		}
		Calendar currCal = Calendar.getInstance();
		currCal.setTimeInMillis(currTime);
		int currIntervalDay = currCal.get(Calendar.DAY_OF_YEAR);
		
		Calendar oldCal = Calendar.getInstance();
		oldCal.setTimeInMillis(oldTime);
		int oldIntervalDay = oldCal.get(Calendar.DAY_OF_YEAR);
		
		intervalDay = currIntervalDay - oldIntervalDay + 1;
		if(intervalDay < 0){
			// 跨年了
			intervalDay = intervalDay + oldCal.getMaximum(Calendar.DAY_OF_YEAR);
		}
		return intervalDay;
	}

	/**
	 * 判断目标时间和当前时间间隔多少天
	 * 
	 * @return
	 */
	public static int getDayInterval(long oldTime) {
		return DateUtil.getDayInterval(System.currentTimeMillis(), oldTime);
	}
	
	public static boolean isTheSameDay(long time) {
		return DateUtil.getDayInterval(System.currentTimeMillis(), time) == 1;
	}
	
	public static boolean isOver7Clock() {
		long currTime = System.currentTimeMillis();
		
		Calendar currCal = Calendar.getInstance();
		currCal.setTimeInMillis(currTime);
		int currHour = currCal.get(Calendar.HOUR_OF_DAY);
		
		if(currHour >= 7){
			return true;
		}
		
		return false;
	}

	
	/**
	 * String 转date 格式化再转
	* @param thistime
	* @return
	* @throws ParseException 
	* @author yangdong
	* 创建时间 :  2017年9月16日 下午5:03:11
	 */
	public static Date getDatebystamp(String thistime) throws ParseException {
	    //String时间戳转化为Date  
        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        Long time=Long.parseLong(thistime.toString());  
        String d = format.format(time);  
        Date date=(Date) format.parse(d);  
        return date;
	}
	
	
	public static void main(String args[]) {
		Calendar cLogin = Calendar.getInstance(Locale.CHINA);
		cLogin.set(2012, Calendar.DECEMBER, 14);

		int d = DateUtil.getDayInterval(cLogin.getTimeInMillis());
		System.out.println("intervalDat = 	" + d);
		
		Date date =  DateUtil.getDateByString(DateUtil.getDayStringDate(new Date())+" 00:00:00");
		System.out.println("intervalDat1111 = 	" + date);
		Date maxtime = DateUtil.getDateByString(DateUtil.getDayStringDate(new Date(System.currentTimeMillis()+(3600000*24)))+" 00:00:00");
		
		System.out.println("intervalDat1111 = 	" + maxtime);
		String st = "Mon Dec 05 15:45:00 CST 2016";
		

	}
	
	
	/**
	 * 获取提前N小时的时间
	 * author: huangyachang
	 * 日期: 2017年9月7日 下午3:14:50
	 */
	public static String cut24(int i,Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	Calendar Cal= Calendar.getInstance();
    	Cal.setTime(date);   
    	Cal.add(Calendar.HOUR_OF_DAY,-i);
    	//System.out.println("date:"+format.format(Cal.getTime()));
		return format.format(Cal.getTime());
	}  
	
	/**
	 * 将时间戳转换为时间
	 * @param s
	 * @return
	 * author: huangyachang
	 * 日期: 2017年9月7日 下午3:56:21
	 */
    public static String stampToDate(String s){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }
    
    
    /**
	 * 根据 Date 相减获取 秒数
	 * author: huangyachang
	 * 日期: 2017年9月7日 下午3:29:48
	 */
	public static int CutBytimeAndtime(String date1,String date2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
//        String date1 = "2014-10-10 00:00:00";
//        String date2 = "2015-10-10 00:00:00";
        c.setTime(sdf.parse(date1));
        int y1 = c.get(Calendar.YEAR);
        int m1 = c.get(Calendar.MONTH);
         
         
        c.setTime(sdf.parse(date2));
        int y2 = c.get(Calendar.YEAR);
        int m2 = c.get(Calendar.MONTH);
         
        int y = Math.abs(y2 - y1);
        int m = y * 12 + Math.abs(m1-m2);
 
        long d1 = sdf.parse(date1).getTime();
        long d2 = sdf.parse(date2).getTime();
        int d = (int) (Math.abs(d2-d1) / (1000 * 60 * 60 * 24));
        int H = (int) (Math.abs(d2-d1) / (1000 * 60 * 60));
        int mm = (int) (Math.abs(d2-d1) / (1000 * 60));
        int s = (int) (Math.abs(d2-d1) / (1000));
         
        /*System.out.println("相差年: " + y);
        System.out.println("相差月: " + m);
        System.out.println("相差天: " + d);
        System.out.println("相差时: " + H);
        System.out.println("相差分: " + mm);
        System.out.println("相差秒: " + s);*/
		return s;
	}
	
	/** 
     * 取当前时间的凌晨 
     * @param date 
     * @flag 0 返回yyyy-MM-dd 00:00:00日期<br> 
     *       1 返回yyyy-MM-dd 23:59:59日期 
     * @return 
     */  
	public static Date weeHours(Date date, int flag) {  
        Calendar cal = Calendar.getInstance();  
        cal.setTime(date);  
        int hour = cal.get(Calendar.HOUR_OF_DAY);  
        int minute = cal.get(Calendar.MINUTE);  
        int second = cal.get(Calendar.SECOND);  
        //时分秒（毫秒数）  
        long millisecond = hour*60*60*1000 + minute*60*1000 + second*1000;  
        //凌晨00:00:00  
        cal.setTimeInMillis(cal.getTimeInMillis()-millisecond);  
           
        if (flag == 0) {  
            return cal.getTime();  
        } else if (flag == 1) {  
            //凌晨23:59:59  
            cal.setTimeInMillis(cal.getTimeInMillis()+23*60*60*1000 + 59*60*1000 + 59*1000);  
        }  
        return cal.getTime();  
    }  
	

	/**
	 * 计算两个日期之间相差多少天
	* @param smdate
	* @param bdate
	* @return
	* @throws ParseException 
	* @author yangdong
	* 创建时间 :  2017年10月23日 下午4:55:00
	 */
	 public static int daysBetween(Date smdate,Date bdate) throws ParseException    
	    {    
	        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
	        smdate=sdf.parse(sdf.format(smdate));  
	        bdate=sdf.parse(sdf.format(bdate));  
	        Calendar cal = Calendar.getInstance();    
	        cal.setTime(smdate);    
	        long time1 = cal.getTimeInMillis();                 
	        cal.setTime(bdate);    
	        long time2 = cal.getTimeInMillis();         
	        long between_days=(time2-time1)/(1000*3600*24);  
	            
	       return Integer.parseInt(String.valueOf(between_days));           
	    }    
	 
	 
	 /**
	  * 获取本年最后一秒
	 * @return 
	 * @author yangdong
	 * 创建时间 :  2018年1月26日 下午4:18:30
	  */
	 public static Date getLastDate(){
		 	Calendar calendar = Calendar.getInstance();
	        calendar.set(Calendar.getInstance().get(Calendar.YEAR) + 1, 0, 1, 0, 0, 0);
	        calendar.setTimeInMillis(calendar.getTimeInMillis() - 1000);
	        return calendar.getTime();
		 
	 }
	 
	 
	 /**
	  * 获取指定时间的下几年或者上几年
	 * @param date
	 * @param num
	 * @return 
	 * @author yangdong
	 * 创建时间 :  2018年1月27日 下午5:23:26
	  */
	 public static Date getPreYear(Date date , int num ) {  
		Calendar calendar = Calendar.getInstance();
		//Date date = new Date(System.currentTimeMillis());
		calendar.setTime(date);
		// calendar.add(Calendar.WEEK_OF_YEAR, -1);
		calendar.add(Calendar.YEAR, num);
		date = calendar.getTime();
		//System.out.println(date.toLocaleString());
		return date;
	    }  
	 
	/**
	 * 判断两个日期是不是同一天
	 * 
	 * @author yangd
	 * @date 2018年6月12日 下午5:50:11
	 * @param id
	 * @return
	 */
	public static boolean isSameDate(Date date, Date time) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date);

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(time);

		boolean isSameYear = cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR);
		boolean isSameMonth = isSameYear
				&& cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
		boolean isSameDate = isSameMonth
				&& cal1.get(Calendar.DAY_OF_MONTH) == cal2
						.get(Calendar.DAY_OF_MONTH);

		return isSameDate;
	}
	
	/**
	 * 获取指定时间和当前时间差距多久
	 * @author yangd
	 * @date 2018年8月28日 下午1:49:16
	 * @param id
	 * @return
	 */
	public  static String formationDate(Date date) {
		String dateString = "";
		// 获取系统当前时间
		 Date now = new Date();
		 try {
			long endTime = now.getTime(); 
			 long currentTime= date.getTime(); 
			 // 计算两个时间点相差的秒数
			 long seconds = (endTime - currentTime);
			 if (seconds<10*1000) {
				 dateString ="刚刚";
			}else if (seconds<60*1000) {
				 dateString = seconds/1000+"秒前";
			}else if (seconds<60*60*1000) {
				 dateString = seconds/1000/60+"分钟前";
			}else if (seconds<60*60*24*1000) {
				 dateString = seconds/1000/60/60+"小时前";
			}else if (seconds<60*60*24*1000*30L) {
				 dateString =seconds/1000/60/60/24+ "天前";
			}else if (date.getYear()==now.getYear()) {//今年并且大于30天显示具体月日
				dateString = new SimpleDateFormat("MM-dd").format(date.getTime());
			}else if (date.getYear()!=now.getYear()) {//大于今年显示年月日
				 dateString =  new SimpleDateFormat("yyyy-MM-dd").format(date.getTime());
			}else{
				 dateString =  new SimpleDateFormat("yyyy-MM-dd").format(date);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dateString;
	}
	
	 /***
	 * yyyy-MM-dd
	 * @return
	 */
	public static String dateToStr(Date date) {
		return DATE_FORMAT.format(date);
	}
	
	

	/***
	 * 增加天数
	 * @param date
	 * @return
	 */
	public static Date addDate(Date date, int days) {
		Calendar calendar = Calendar.getInstance() ;
		calendar.setTime(date); 
		calendar.add(Calendar.DATE,days); //把日期往后增加相应的天,整数  往后推,负数往前移动 
		date=calendar.getTime(); //这个时间就是日期往后推迟后的结果 
		return date;
	}
	
	/***
	 * 增加小时
	 * @param date
	 * @return
	 */
	public static Date addDateHourOfDay(Date date, int hours) {
		Calendar cal = Calendar.getInstance() ;
		cal.setTime(date) ;
		cal.add(Calendar.HOUR_OF_DAY, hours) ;
		date=cal.getTime(); //这个时间就是日期往后推迟后的结果 
		return date;
	}
	
	/*
	 * 只取年月日,返回Date类型
	 */
	public static Date getDate(Date date) {
		Date now = new Date();
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(now);
		// 将时分秒,毫秒域清零
		cal1.set(Calendar.HOUR_OF_DAY, 0);
		cal1.set(Calendar.MINUTE, 0);
		cal1.set(Calendar.SECOND, 0);
		cal1.set(Calendar.MILLISECOND, 0);
		System.out.printf("%1$tF %1$tT\n", cal1.getTime());// cal1.getTime()返回的Date已经是更新后的对象
		return cal1.getTime();
	}
}
