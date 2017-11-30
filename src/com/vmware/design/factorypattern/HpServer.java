package com.vmware.design.factorypattern;

public class HpServer extends Server {
	private double price;
	
	
	@Override
	void getVendor() {
		System.out.println("HpServer 2.5");
		
	}


	@Override
	public double getPrice(double price) {
		// TODO Auto-generated method stub
		return price * 2.5;
	}
	

}
