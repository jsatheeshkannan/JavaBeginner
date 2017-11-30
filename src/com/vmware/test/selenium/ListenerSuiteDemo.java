package com.vmware.test.selenium;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class ListenerSuiteDemo implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		System.out.println("DemoSuiteListenerStart:" + suite.getName());

	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("DemoSuiteListenerFinish:" + suite.getName());

	}

}
