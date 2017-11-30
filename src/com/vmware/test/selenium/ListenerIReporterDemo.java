package com.vmware.test.selenium;

import java.util.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

public class ListenerIReporterDemo implements IReporter{

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		System.out.println("ListenerIReporterDemogenerateReport:"+xmlSuites.size());
		
	}

}
