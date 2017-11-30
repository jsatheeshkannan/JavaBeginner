package com.vmware.design.factorypattern;

public class FactoryGateway {

	

	public Server vendor(String vendorname) throws FactoryObjectFailedException {
		if(vendorname.equalsIgnoreCase("HP")){
			return new HpServer();
		}
		else if(vendorname.equalsIgnoreCase("DELL")){
			return new DellServer();
		}
		else{
			throw new FactoryObjectFailedException("No relevant vendor found");
		}
		//return null;
	}

}
