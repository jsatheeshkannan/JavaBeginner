package com.vmware.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Apple {
	WebDriver driver;
	GmailPage gp;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "c:\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("setup");
	}

	@AfterClass
	public void shutdown() {
		System.out.println("shutdown");
		//this.driver.quit();
		// driver.close();
	}

	@Test
	public void loginPage() {
		System.out.println("loginpage");
		gp  = new GmailPage();
		String getTitle = gp.getPage(driver);
		Assert.assertEquals(getTitle, "Gmail");
		System.out.println(driver.getTitle());
	}

	@Test(dependsOnMethods={"loginPage"},alwaysRun=true)
	public void fillUser() {
		String username = gp.setUsername("catch");
		Assert.assertEquals(username, "catch");
		//driver.get("http://yahoo.com");
		
		
	}
	@Test(dependsOnMethods={"fillUser"})
	public void pressNext(){
		gp.getNext();
		
	}
}
