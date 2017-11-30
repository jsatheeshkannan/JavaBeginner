package com.vmware.test.selenium;

import java.util.List;

import org.omg.CORBA.portable.InvokeHandler;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.xml.XmlSuite;

public class ListenerCustom implements ITestListener,IReporter,ISuiteListener,IInvokedMethodListener{

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("beforeInvocation");
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("afterInvocation");
		
	}

	@Override
	public void onStart(ISuite suite) {
		System.out.println("onStartSuite");
		
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("onFinishSuite");
		
	}

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		System.out.println("generateReport");
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStartTest");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinishTest");
		
	}

}
