package com.vmware.test.selenium;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class ListenerIInvokedMethodDemo implements IInvokedMethodListener {

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("IInvokedMethodListener beforeInvocation: "+method.getTestMethod());
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("IInvokedMethodListener afterInvocation: "+method.getTestMethod());
		
	}

}
