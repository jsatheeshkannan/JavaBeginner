package com.vmware.test.selenium;

import org.apache.commons.logging.Log;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({com.vmware.test.selenium.ListenerITestDemo.class,com.vmware.test.selenium.ListenerSuiteDemo.class})
public class Cricketer {
	@Test(dataProvider="blower",dataProviderClass=blowerlist.class)
	public void blower(String n1,String n2){
		
		System.out.printf("blower method:%s %s\n",n1.toUpperCase(),n2.toUpperCase());
	}
	@Test(dataProvider="batman",testName="batmantest")
	public void batman(String fname,String lname){
		
		System.out.printf("batman method:%s %s\n",fname,lname);
	}
	@Test(enabled=false)
	public void wicketkeeper(){
		System.out.println("wicket keeper");
	}
	@DataProvider(name="batman")
	public Object[][] batmans(){
		Object[][] obj={{"fname","lname"},
				{"sathesh","kannan"}
		
		};
		return obj;
	}

}

class blowerlist{
	@DataProvider(name="blower")
	public static String[][] blow(){
		String[][] obj={
				{"bhuvaneswar","singh"},
				{"satheesh","kannan"},
				{"dashvanth","satheesh"}
		};
		
		return obj;
	}
}
