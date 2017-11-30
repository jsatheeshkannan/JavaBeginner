package com.vmware.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DemoTimeExample {
	public void getCalendar(){
		Calendar c1 = new GregorianCalendar();
		System.out.println(c1.getTime());
		System.out.println(c1.get(Calendar.MONTH));
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
		System.out.println(c1.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		c1.set(Calendar.MONTH, 13);
		
		System.out.println("cp:"+c1.get(Calendar.MONTH));
		System.out.println(c1.getTimeZone());
		
		Calendar c2 = new GregorianCalendar();
		TimeZone tz1 = c2.getTimeZone();
		c2.setTimeZone(tz1);
		ZoneId.getAvailableZoneIds().stream().forEach(i -> System.out.println(i));
		TimeZone tz2=TimeZone.getTimeZone("US/Pacific");
		c1.setTimeZone(tz2);
		System.out.println(c1.getTimeZone());
		System.out.println(c1.getTimeZone().getDisplayName());
	}
	public void getandvalidateTime() {
		System.out.println(LocalTime.now());
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		System.out.println(DateTimeFormatter.ISO_DATE_TIME + "\n" + DateTimeFormatter.ISO_DATE);

		Date da = new Date();
		System.out.println(da.getTime()+":"+da.getDate());
		
		Date d1=new Date();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date d2=new Date();
		
		System.out.println(d1.compareTo(d2)); 
		/**
		 * -1 d1>d2
		 *  0 d1=d1
		 *  1 d1<d2
		 */
		System.out.println(d1.before(d2));
		System.out.println(d1.after(d2));
		long t1 = System.currentTimeMillis();
		java.sql.Time a1 = new java.sql.Time(t1);
		System.out.println(t1+":"+a1.getTime());
		System.out.println(a1.toLocalTime()+"->"+a1.toLocaleString());
		java.sql.Timestamp ts1 = new java.sql.Timestamp(t1);
		System.out.println(ts1.getNanos());
		System.out.println(ts1.getTime());

	}

}
