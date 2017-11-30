package com.vmware.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


public class DemoAnnotationMain {
	@MyTest
	public void g1(){
		System.out.println("Game1");
	}
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException {
		DemoAnnotationMain d = new DemoAnnotationMain();
		d.g1();
		Class c1 = Class.forName("com.vmware.annotation.Simple");
		System.out.println(c1.getName());
		Simple s = (Simple)c1.newInstance();
		s.g1();
		Class c2 = Boolean.class;
		System.out.println(c2.getName());
		Class c3 = int.class;
		System.out.println(c3.getName()+":"+c3.isInterface());
		Class c4 = MyTest.class;
		System.out.println(c4.isInterface());
		Method m  =c1.getMethod("g1",Simple.class);
		MyTest an = m.getAnnotation(MyTest.class);
		System.out.println(an.testName());
		
	}

}
class Simple{
	@MyTest(testName="test1")
	public void g1(){
		System.out.println("simple g1");
	}
	@TestInfo(classlist={"abs","ford"},month=Month.FEB)
	public void g2(){
		System.out.println("simple g2");
	}
	
}
class Movie{
	
}
@Target(ElementType.METHOD)
@Retention (RetentionPolicy.RUNTIME)
@interface MyTest{
	String testName() default "";
	
}
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo{
	
	Month month() default Month.JAN;
	String[] classlist() default "";
	 
	
}
enum Month {
	JAN,FEB
}
