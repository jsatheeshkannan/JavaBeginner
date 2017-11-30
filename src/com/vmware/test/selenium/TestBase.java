package com.vmware.test.selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {

	@BeforeTest
	public void avilableGround() {
		System.out.println("1 ground available");

	}

	@BeforeClass
	public void availableBatBall() {
		System.out.println("2 availableBatBall");
	}

	@BeforeMethod(enabled = false)
	public void newBat() {
		System.out.println("33 new bat changes");
	}

	@BeforeMethod(enabled = false)
	public void newBall() {
		System.out.println("44 new ball changes");
	}

	@Test(invocationCount = 1, enabled = true,groups={"P0","P1"},dataProvider="batman",dataProviderClass=AppDataProvider.class)
	public void batman(String name,int i) {
		System.out.println("1=> batman batting:"+name+":"+i);

	}

	@Test(invocationCount = 1,groups={"P0","P1"},dataProvider="blowers",dataProviderClass=AppDataProvider.class)
	public void blower(String name,int no) {
		
		String[][] names = new String[][]{
			{"satheesh","kannan"},
			{"yogesh","kannan"},
			{"Ramaya","satheesh"}
		};
		//System.out.println(]);
		System.out.println("2=> blower blowing:"+name+":"+no);
	}

	@Test(groups={"P1"},dependsOnMethods={"batman","blower"})
	public void run() {
		System.out.println("3=> taking runs");
	}

	@Test(groups={"P0","P1"},dependsOnMethods="blower")
	void over() {
		System.out.println("4=> over ends");
	}

	@Test(groups={"P0","P1"})
	void wicketkeeper() {
		System.out.println("5=> Wicket Keeper");
	}

	@AfterTest
	public void freeGround() {
		System.out.println("111 All leave ground");
	}

	@AfterClass
	public void cleanPitch() {
		System.out.println("100 take ball bat and stump");
		return;
	}

}
