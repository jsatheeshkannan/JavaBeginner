package com.vmware.test.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MMproj {
	WebDriver driver;

	@Test(enabled = false)
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\geckodriver-v0.15.0-win64\\chromedriver.exe");
		String url = "http://10.134.161.54:8080/ui/mgmt/index.html";
		String user = "admin";
		String pass = "admin";
		String username = "username";
		String password = "password";
		String login = "//button[@type='submit']";
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.id(username)).sendKeys(user);
		driver.findElement(By.id(password)).sendKeys(pass);
		driver.findElement(By.xpath(login)).click();
		driver.findElement(By.xpath("//button[@class='nav-icon dropdown-toggle']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.close();
	}

	@Test(enabled = true)
	public void games() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\geckodriver-v0.15.0-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com");
		File a1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		

		File a2 = new File("f11.png");
		FileCopy(a1, a2);

		driver.close();

	}

	@Test(enabled = true)
	public void readIO() throws IOException, InterruptedException {

		File f1 = new File("f1.png");
		System.out.println(f1.getFreeSpace());
		File f2 = new File("b.png");
		FileCopy(f1, f2);

	}

	@Test(enabled=false)
	public void sp() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\geckodriver-v0.15.0-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://10.139.0.19");
		driver.findElement(By.id("auth-login")).sendKeys("admin");
		driver.findElement(By.id("auth-password")).sendKeys("Admin!23");
		driver.findElement(By.id("login-button")).click();

		driver.findElement(By.cssSelector("#app-menu-link")).click();
		WebElement e = driver.findElement(By.xpath("//span[text()='Administration']"));
		e.click();
		Thread.sleep(3000);
		File a1 = e.getScreenshotAs(OutputType.FILE);
		File a2 = new File("f.png");
		// FileUtils.copyFile(a1, a2);
		FileCopy(a1, a2);
		driver.close();
	}

	private void FileCopy(File a1, File a2) throws FileNotFoundException, IOException {
		FileInputStream inStream = new FileInputStream(a1);
		FileOutputStream outStream = new FileOutputStream(a2);
		int length;
		while ((length = inStream.read()) != -1) {
			outStream.write(length);

		}
		inStream.close();
		outStream.close();
	}
}
