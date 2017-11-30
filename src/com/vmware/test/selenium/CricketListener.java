package com.vmware.test.selenium;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CricketListener extends TestListenerAdapter{

	@Override
	public void onTestSuccess(ITestResult tr) {
		System.out.println("success"+tr.getName());
	}

	@Override
	public void onTestFailure(ITestResult tr) {
		System.out.println("failed:"+tr.getName());
	}

}
