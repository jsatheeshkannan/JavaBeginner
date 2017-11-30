package com.vmware.design.factorypattern;

public class DellServer extends Server{

	
	
	

	@Override
	void getVendor() {
		System.out.println("DellVendor");
		
	}

	@Override
	public double getPrice(double price) {

		return price*2.14;
	}
	
	

}
