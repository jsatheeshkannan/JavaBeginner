package com.vmware.test.selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerITestDemo implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("ListenerITestDemo onTestStart:"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("ListenerITestDemo onTestSuccess:"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("ListenerITestDemo onStart:"+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("ListenerITestDemo onFinish:"+context.getName());
		
	}
	

}
