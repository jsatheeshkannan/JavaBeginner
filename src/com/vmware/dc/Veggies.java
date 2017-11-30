package com.vmware.dc;

public class Veggies implements Veg{
	private String vegName;
	private int vegId;
	public String getVegName() {
		return vegName;
	}
	public void setVegName(String vegName) {
		this.vegName = vegName;
	}
	public int getVegId() {
		return vegId;
	}
	public void setVegId(int vegId) {
		this.vegId = vegId;
	}
	@Override
	public void getVeg() {
		System.out.println(this.vegId+this.vegName);
		
	}

}
