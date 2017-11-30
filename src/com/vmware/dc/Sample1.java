package com.vmware.dc;

import java.util.ArrayList;
import java.util.List;

public class Sample1 {

	
	

	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.add();
		d1.i=10;
		d1.j=20;
		d1.add();
		Demo d2 = new Demo();
		System.out.println(d2.i);
		d2.add();
		
		//shadow copy one object two reference
		d2=d1;
		System.out.println(d2.i);
		d2.add();
		d1.i=40;
		d2.add();
		
		//deep copy 
		System.out.println("deep copy");
		Demo deep1 = new Demo();
		deep1.i=5;
		deep1.j=10;
		deep1.add();
		System.gc();
		
		//interFace();
	}

	private static void interFace() {
		List<Veg> v1= new ArrayList();
		List<Veg> v2= new ArrayList();
		for(int i=0;i<100;i++){
			v1.add(new Fruit());
		}
		for(int i=0;i<10;i++){
			v1.add(new Veggies());
		}
		System.out.println("completed");
	}

}
