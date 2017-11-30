package com.vmware.design.singleton;

public class SingletonImpl {
	private static  SingletonImpl s=null;

	private SingletonImpl() {
		System.out.println("singlton created");
		
	}
	
	public static SingletonImpl newInstance(){
		if(s == null){
		s = new SingletonImpl();
		
		}
		return s;
		
		
	}
	public void add(){
		System.out.println("add");
	}

}
