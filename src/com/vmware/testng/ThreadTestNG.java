package com.vmware.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class ThreadTestNG {
	public void a1(){
		System.out.println("a1");
		System.out.println(Thread.currentThread().getName());
	}
	@BeforeMethod
	public void bma1(){
		System.out.println("Method Before");
	}
	@AfterMethod
	public void ama1(){
		System.out.println("Method After");
	}
	
	public void b1(){
		System.out.println("b1");
		System.out.println(Thread.currentThread().getName());
	}
	@BeforeClass
	public void bca1(){
		System.out.println("class Before");
	}
	@AfterClass
	public void aca1(){
		System.out.println("class After");
	}
	public void Test3()throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("Test3 3000ms");
		System.out.println(Thread.currentThread().getName());
		
	}
	public void Test1() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println("Test1 2000");
		System.out.println(Thread.currentThread().getName());
	}
	public void Test2() throws InterruptedException{
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName());
	}
	@AfterTest
	public void afterTest(){
		System.out.println("TestAfter");
		System.out.println(Thread.currentThread().getName());
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("TestBefore");
	}
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("SuiteBefore");
		System.out.println(Thread.currentThread().getName());
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("SuiteAfter");
		
	}
}
