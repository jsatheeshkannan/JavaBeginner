package com.vmware.seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class DemoSeleniumJavaScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		String url="https://www.google.co.in";
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		((JavascriptExecutor) driver).executeScript("document.getElementsByTagName('button').click()");
	}

}
