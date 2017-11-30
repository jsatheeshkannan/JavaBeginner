package com.vmware.design.factorypattern;

public class FactoryMain {
	public static void main(String[] args) {
		String vendorname = "dell1";
		FactoryGateway f = new FactoryGateway();
		Server s1 = null;

		s1 = f.vendor(vendorname);

		s1.getVendor();
		System.out.println(s1.getPrice(100));
	}

}
