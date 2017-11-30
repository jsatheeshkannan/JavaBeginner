package com.vmware.testng;

import org.testng.annotations.Test;

public class Month {
  @Test
  public void jan() {
	  System.out.println("jan");
  }
  @Test(timeOut=1002)
  public void feb() {
	  try {
		Thread.sleep(1001);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println("feb");
  }
  @Test(priority=9)
  public void mar() {
	  System.out.println("mar");
  }
  @Test
  public void dec(){
	  System.out.println("dec");
  }
  @Test(invocationCount=5)
  public void aug() throws InterruptedException{
	  Thread.sleep(1000);
	  System.out.println("aug");
  }
  @Test
  public void may(){
	  System.out.println("may");
  }
}

