package com.vmware.dc;

public class Fruit implements Veg{
	private String fName;
	private int fId;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	
	public void getVeg() {
		System.out.println(this.fId+this.fName);
		
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("fruit garbage collected");
	}
}
