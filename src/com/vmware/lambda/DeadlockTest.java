package com.vmware.lambda;

public class DeadlockTest {
	public static void main(String[] args) {
		Combo c = new Combo();
		c.g1();
	}

}
class Combo {
	String str1="value1";
	String str2="value2";
	public void g1(){
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					synchronized(str1){
						synchronized (str2) {
							System.out.println("Thread1");
							
						}
					}
				}
				
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					synchronized(str2){
						synchronized (str1) {
							System.out.println("Thread2");
							
						}
					}
				}
				
			}
		});
		t1.start();
		t2.start();
	}
}
