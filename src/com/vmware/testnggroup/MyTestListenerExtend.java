package com.vmware.testnggroup;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class MyTestListenerExtend extends TestListenerAdapter{
	static int success=0;
	static int fail=0;
	@Override
	public void onTestSuccess(ITestResult tr) {
		success++;
		System.out.println("ontestsuccess:"+tr.getName()+":"+success);
	}

	@Override
	public void onTestFailure(ITestResult tr) {
		fail++;
		System.out.println("testfailure"+fail);
	}

	@Override
	public void onStart(ITestContext testContext) {
		System.out.println("onstart");
	}

	@Override
	public void onFinish(ITestContext testContext) {
		System.out.println("onfinish");
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onteststart");
	}
	
}
