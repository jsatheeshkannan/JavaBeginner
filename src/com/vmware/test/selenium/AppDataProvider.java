package com.vmware.test.selenium;

import org.testng.annotations.DataProvider;

public class AppDataProvider {
	@DataProvider(name="blowers")
	public static Object[][] cricketPlayer(){
		return new Object[][]{
			{"satheesh",10},
			{"kannan",11}
		};
	}
	@DataProvider(name="batman")
	public static Object[][] cricketBatman(){
		//System.out.println(this.toString());
		return new Object[][]{
			{"jsk",11},
			{"dashu",12},
			{"sarvesh",13},
			{"nishok",14}
		};
		
	}

} 