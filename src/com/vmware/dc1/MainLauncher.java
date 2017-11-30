package com.vmware.dc1;

import java.lang.reflect.Field;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLauncher {

	public static void main(String[] args) {
		System.out.println("MainLaucher...");
		/*
		 * EmpInvoker e = new EmpInvoker(); e.g1();
		 */
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
		if (ctx.containsBean("employee"))
			System.out.println("=====employee bean exists======");
		ctx.setDisplayName("GameChanger");
		System.out.println(ctx.getApplicationName());
		EmpInvoker ef = ctx.getBean(EmpInvoker.class);
		ef.g1();
		System.out.println(ef.toString());
		ctx.close();
		// ctx.registerShutdownHook();
		//testReflection();
	}

	private static void testReflection() {
		System.out.println("========class =============");
		
		Class c1 = Employee.class;
		System.out.println(c1.getName());
		System.out.println(c1.getSimpleName());
		System.out.println(c1.getCanonicalName());
		System.out.println(c1.isAnnotation());
		System.out.println(c1.getTypeName());
		
		System.out.println("============interface =============");
		Class in1 = Delta.class;
		System.out.println(in1.isInterface());
		System.out.println(in1.getName());
		System.out.println(in1.getSimpleName());
		System.out.println(in1.getModifiers());
		try {
			Field f1 = in1.getField("URL");
			System.out.println(f1.getName());
			System.out.println(f1.getModifiers());
			//System.out.println(f1.);
		} catch (NoSuchFieldException | SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("===================================");
		try {
			Employee c2 =Employee.class.newInstance();
			System.out.println(c2.hashCode());
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(in1.);

		

		// System.out.println(ef.toString());
	}

}
