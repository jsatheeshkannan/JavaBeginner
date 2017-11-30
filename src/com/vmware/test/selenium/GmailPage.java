package com.vmware.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class GmailPage {
	WebDriver driver;
	WebElement e;
	String url = "http://gmail.com";

	public String getPage(WebDriver driver) {
		this.driver = driver;
		
		this.driver.get(url);
		return this.driver.getTitle();

	}

	public String setUsername(String username) {
		e = driver.findElement(By.xpath(".//input[@name='identifier']"));
		e.sendKeys(username);
		System.out.println(e.getAttribute("value"));
		return e.getAttribute("value");
	}
	
	public void getNext() {
		// TODO Auto-generated method stub
		e = driver.findElement(By.xpath(".//span[text()='Next']"));
	}

}
