package com.vmware.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomAnno1 {

	public CustomAnno1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		System.out.println("CustomAnno1");
		Role role = new Coffee();
		StringBuilder s;
		StringBuffer sb;
		System.out.println(role.name());
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://paytm.com");
		driver.findElement(By.xpath("//a[@href='https://paytm.com/bus-tickets']")).click();
		Actions aaa = new Actions(driver);
		aaa.sendKeys(Keys.TAB);
		driver.findElement(By.xpath(".//*[@id='text-box' and @data-reactid='154']")).sendKeys("Namakkal");

		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='text-box' and @data-reactid='167']")).sendKeys("Chennai");
		Class<Tea> tea = Tea.class;
		if (tea.isAnnotationPresent(Role.class)) {
			for (Annotation a : tea.getAnnotations()) {
				System.out.println(a.annotationType().getSimpleName());
				System.out.println(a.toString());
				Runtime.getRuntime().availableProcessors();
				String[] v1 = { "sa", "ka", "das", "ram" };
				List<String> asd = Arrays.asList(v1);
				asd.forEach(i -> System.out.println(i));

			}
		}

		Class<Role> r = Role.class;
		for (Annotation a : r.getAnnotations()) {
			System.out.println(a);
			Class ab = a.annotationType();
			System.out.println(ab.getName());
			System.out.println(a.annotationType().getSimpleName());
			System.out.println(a.annotationType().getClass());
		}

	}
}

@Role(name = "vol1")

class Tea {
	@SuppressWarnings(value = { "" })
	public int df() {
		System.out.println();
		return 0;
	}
}

class Coffee implements Role {

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "satheesh";
	}

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Role {
	String name() default "";
}
