package com.vmware.testng.facebook;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import org.eclipse.jetty.util.ArrayQueue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookPage {
	// WebDriver driver;

	@Test(enabled = false)
	public void FacebookPage() {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath(".//input[@name='firstname']")).sendKeys("user1");
		driver.findElement(By.xpath(".//input[@name='lastname']")).sendKeys("last");
		driver.findElement(By.xpath(".//input[@name='reg_email__']")).sendKeys("user1@gmail.com");
		WebElement idday = driver.findElement(By.id("day"));
		Select se = new Select(idday);
		se.selectByValue("14");

		WebElement idmonth = driver.findElement(By.id("month"));
		Select se1 = new Select(idmonth);
		se1.selectByValue("2");
		WebElement idyear = driver.findElement(By.id("year"));
		Select se2 = new Select(idyear);
		se2.selectByValue("1983");

	}
	
	public static void main(String[] args) {
		String name = "satheesh kannan";
		int i=10;
		increment(i,name);
		System.out.println(i+":"+name);
		
		//stackMethod(name);
		//queueMethod(name);
	}

	private static void increment(int i,String name) {
		i=i+1;
		name="demo";
		System.out.println(i+name);
		
	}

	private static void queueMethod(String name) {
		Queue<Character> q = new ArrayQueue<>();
		for(Character c:name.toCharArray()){
			q.add(c);
		}
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.size());
		
		Character c = new Character('T');
		Character d = new Character('Z');
		List<Character> l = Arrays.asList(c,d);
		System.out.println(c);
		q.addAll(l);
		System.out.println(q);
		
		if(!q.isEmpty()){
			System.out.println("Not empty");
		}
		if(q.contains('a')){
			System.out.println("found");
		}else{
			System.out.println("not found");
		}
		
		
	}

	private static void stackMethod(String name) {
		Stack<Character> ticket = new Stack<>();
		System.out.println(ticket.size());
		for(char c:name.toCharArray()){
			ticket.push(c);
		}
		
		System.out.println(ticket);
		Character sp = ticket.peek();
		System.out.println(ticket + ":" + sp);
		System.out.println(ticket.peek());
		
				int count = 0;
		/*while (ticket.size() != 0) {

			count++;

			System.out.println("Stack not empty" + count + ":" + ticket.pop());
			if (count == 10) {
				System.exit(0);
			}

		}*/
		while(!ticket.isEmpty()){
			
			System.out.println(ticket.pop()+":"+ count++);
		}
		if(ticket.isEmpty()){
			System.out.println("Stack Empty Now");
		}
	}

}
