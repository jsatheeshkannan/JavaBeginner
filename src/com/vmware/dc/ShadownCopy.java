package com.vmware.dc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class ShadownCopy {
	public static void main(String[] args) throws ParseException {
		//cloning();
		
		//dateExample();
		
		String str1="2017-05-10";
		String str2="2018-05-10";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1=sdf.parse(str1);
		Date d2=sdf.parse(str2);
		if(d1.compareTo(d2) > 0 )
			System.out.println("d1 is big");
		else if(d1.compareTo(d2) == 0)
			System.out.println("d1 equals d2");
		else{
			System.out.println("d1 is small");
		}
	}

	private static void dateExample() {
		LocalDateTime n = LocalDateTime.now();
		System.out.println(LocalTime.now());
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String dd =sdf.format(new Date());
		System.out.println("St:"+dd);
		try {
			Date df = sdf.parse(dd);
			System.out.println(df);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		System.out.println("cal:"+cal);
		System.out.println(cal.getTime()+":"+cal.getTimeZone());
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		System.out.println(Instant.now());
		System.out.println(Duration.ofSeconds(1000));
		
		System.out.println(Calendar.DAY_OF_MONTH);
		System.out.println(Calendar.DAY_OF_YEAR);
		System.out.println(Calendar.APRIL);
	}

	private static void cloning() {
		Shadows s = new Shadows();
		s.i=10;
		s.j=20;
		System.out.println(s);
		Shadows s1 = new Shadows();
		System.out.println(s1);
		Shadows s2 = s; //shadow co
		System.out.println(s2);
		s2.i=30;
		System.out.println(s2);
		System.out.println(s);
		System.out.println("===================================");
		try {
			
			Shadows s3 = (Shadows) s.clone();
			System.out.println(s3);
			System.out.println(s);
			s.i=100;
			System.out.println(s3);
			System.out.println(s);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class Shadows implements Cloneable{
	int i;
	int j;
	
	@Override
	public String toString() {
		return "Shadows [i=" + i + ", j=" + j + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
