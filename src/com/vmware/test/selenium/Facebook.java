package com.vmware.test.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Facebook {
	public static void main(String[] args) throws InterruptedException, ClassNotFoundException {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		/*
		 * String forgotpass="#login_form tr:nth-child(3) td:nth-child(2) a";
		 * driver.get("http://facebook.com");
		 * driver.findElement(By.cssSelector(forgotpass)).click();
		 */
		ProfilesIni prof = new ProfilesIni();
		FirefoxProfile fp = prof.getProfile("user1");
		//FirefoxProfile fp = new FirefoxProfile(new File("C:\\Users\\kannans\\Documents\\firefoxprofile\\user1"));
		fp.setAcceptUntrustedCertificates(true);
		fp.setAssumeUntrustedCertificateIssuer(false);
		Class.forName("com.vmware.test.selenium.Facebook");
	
		DesiredCapabilities dfirefox = DesiredCapabilities.firefox();
		dfirefox.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver = new FirefoxDriver(dfirefox);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String loginsite = "https://10.139.0.19";
		Thread.sleep(3000);
		String user = "admin";
		String pass = "Admin!23";
		String usercsspath = "#login-form #auth-login";
		String passcsspath = "#login-form #auth-password";
		String submit = "#login-form #login-button";
		driver.get(loginsite);
		driver.findElement(By.cssSelector(usercsspath)).sendKeys(user);
		driver.findElement(By.cssSelector(passcsspath)).sendKeys(pass);
		driver.findElement(By.cssSelector(submit)).click();

		driver.close();

	}

}
