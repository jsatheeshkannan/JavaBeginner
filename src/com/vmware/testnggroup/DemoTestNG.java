package com.vmware.testnggroup;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyTestListener.class)

public class DemoTestNG {
	@Test(testName = "demo1")
	public void g1() {
		int a = 10;
		int b = 15;

		Assert.assertTrue(true, "demo g1 true");

		Assert.assertTrue(a < b, "a is small");

		// Assert.assertTrue(a>b,"a is big");
		System.out.println("g1");
	}

	@Test(testName="demo2")
	public void g2() {
	
		System.out.println("g2");

	}
	@Test
	public void g3() {
	
		System.out.println("g3");
		Assert.assertTrue(false,"i'm failed!");

	}
	@Test(dependsOnMethods={"g3"},alwaysRun=true)
	public void g4() {
		
		System.out.println("g4");
		Assert.assertTrue(true,"i'm success!");

	}

}
