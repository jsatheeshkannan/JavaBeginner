package com.vmware.thread;

public class ThreadHelper {
	public static void main(String[] args) {
		ThreadProperty tp1 = new ThreadProperty();
		ThreadProperty tp2 = new ThreadProperty();
		ThreadProperty tp3 = new ThreadProperty();
		
		Thread t1 = new Thread(tp1);
		
		t1.start();
		Thread t2 = new Thread(tp2);
		t2.setDaemon(true);
		t2.start();
		Thread t3 = new Thread(tp3);
		t3.start();
		
	}

}
