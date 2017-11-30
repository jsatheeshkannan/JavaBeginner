package com.vmware.testng;

import org.testng.annotations.Test;

@Test
public class ExtendThreadTestNG extends ThreadTestNG{

	public void extendTest1(){
		System.out.println("extendTest1");
		System.out.println(Thread.currentThread().getName());
	}
	public void extendTest2(){
		System.out.println("extendTest2");
		System.out.println(Thread.currentThread().getName());
	}
	
}
