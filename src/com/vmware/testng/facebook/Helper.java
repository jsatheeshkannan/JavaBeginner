package com.vmware.testng.facebook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Helper {
	WebDriver d;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\geckodriver-v0.15.0-win64\\chromedriver.exe");
	}

	@Test(enabled = false)
	public void irctcCode() {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\geckodriver-v0.15.0-win64\\chromedriver.exe");
		String url = "http://irctc.co.in";
		d = new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
		if (!d.findElement(By.name("otp")).isSelected()) {
			System.out.println("not selected");
			d.findElement(By.name("otp")).click();
		}
		String xpath1 = "loginbutton";
		List<WebElement> e = d.findElements(By.xpath(".//*[@id='loginbutton']//preceding::input"));
		System.out.println(d.getTitle());

		System.out.println(e.size());
		// for(WebElement e1:e){
		// System.out.println(e1.getAttribute("name"));
		// }
		System.out.println("completd");
		d.close();
		// d.findElement(By.id(xpath1)).click();
	}

	@Test(dependsOnMethods = "irctcCode", enabled = false)
	public void fbCode() throws IOException {
		String url = "http://facebook.com";
		d = new ChromeDriver();
		d.get(url);
		WebElement a1 = d.findElement(By.linkText("Forgotten account?"));
		a1.click();
		// WebElement ef = d.findElement(By.id("identify_email"));

		/*
		 * File fsrc = a1.getScreenshotAs(OutputType.FILE); File f1 = new
		 * File("fbfp.png");
		 * 
		 * FileInputStream fis1 = new FileInputStream(fsrc); FileOutputStream
		 * fos1 = new FileOutputStream(f1);
		 * 
		 * int fol; while ((fol = fis1.read()) != 0) { fos1.write(fol); }
		 * fis1.close(); fos1.close();
		 */
		/*
		 * System.out.println(d.getTitle()); d.navigate().back();
		 * d.navigate().to("https://google.com");
		 * System.out.println(d.getTitle());
		 * 
		 * d.close();
		 */

	}

	@Test(enabled = false)
	public void fbkey() throws IOException {
		String url = "http://facebook.com";
		WebDriver d = new ChromeDriver();
		d.get(url);
		WebElement e = d.findElement(By.id("email"));
		WebElement ef = d.findElement(By.name("lastname"));
		Actions at = new Actions(d);
		at.moveToElement(e).click().sendKeys(e, "a").keyDown(e, Keys.SHIFT).sendKeys(e, "h").sendKeys(e, "e")
				.sendKeys(e, "d").keyUp(e, Keys.SHIFT).pause(Duration.ofMillis(1000))

				.doubleClick(ef).sendKeys(ef, "mydelta").perform();

	}

	@Test
	public void cmdLine() throws IOException{
		//Process p= Runtime.getRuntime().exec("ipconfig");
		Process p = Runtime.getRuntime().exec("ipconfig");
		try {
			p.waitFor();
			BufferedReader o = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String l;
			String[] s;
			List<String> s1 = new ArrayList<String>();
			while((l = o.readLine()) != null){
				System.out.println(l);
				if("IPv4 Address".contains(l)){
					s=l.split(":");
				}
			}
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Test(enabled = false)
	public void nettour() {
		String url = "http://newtours.demoaut.com/";
		d = new ChromeDriver();
		d.get(url);
		WebElement e1 = d.findElement(By.xpath("//*[text()=\"Home\"]"));
		WebElement e2 = d.findElement(
				By.xpath("//table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]"));
		Actions a1 = new Actions(d);
		Action aa1 = a1.moveToElement(e1).build();
		System.out.println(e2);

	}

}
