package com.vmware.testng.facebook;

public class StackOver {
	public static void main(String[] args) {
		d1 d = new d1();
		d.callincrement();
	}
}

class d1 {
	int i, j;
	String name;
	int count;
	public void increment(d1 d) {
		d1 d2 = d;
		d2.i = d2.i + 1;
		count++;
		d2.name = "satheesh";
		System.out.println("increment:" + d2.i + d2.name+":"+count);
		callincrement();
	}

	public void callincrement() {
		
		d1 dd =new d1();
		dd.i = 10;
		dd.name = "sa";
		System.out.println(dd.i + dd.name);

		increment(dd);
		System.out.println(dd.i + dd.name);

	}

}
