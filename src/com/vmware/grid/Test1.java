package com.vmware.grid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	//DesiredCapabilities and RemoteWebDriver objects
	@Test
	public void login(){
		DesiredCapabilities ds = DesiredCapabilities.chrome();
		ds.setBrowserName("chrome");
		ds.setPlatform(Platform.WIN10);
		WebDriver driver = new RemoteWebDriver(ds);
		driver.get("http://google.com");
		System.out.println("success");
		Assert.assertEquals(true, true);
	}

}
