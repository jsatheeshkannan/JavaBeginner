package com.vmware.exceptions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.commons.exec.ExecuteStreamHandler;

public class General {
	public static void main(String[] args) {
		int i = 8;
		method2(i);
		System.out.println("completed");
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10;i++){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
				
			}
		});
		t1.start();
		ExecutorService es = Executors.newFixedThreadPool(5);
		for(int ii=0;ii<5;ii++){
		es.execute(new Runnable(){

			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				for(int i=0;i<10;i++){
					System.out.println(Thread.currentThread().getName());
				}
				
			}
			
		});
		}
	}

	private static void method2(int i) {
		try {
			method1(i);
		}
		catch (MyObjectNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void method1(int i) throws  MyObjectNotFound {

		if (i < 10) {
			a();
			

		} else if (i > 15) {
			throw new MyObjectNotFound("i bigger than 15");
		}
	}

	private static void a() {
		try{
		throw new ObjectNotFound("i less than 10");
		}
		catch(ObjectNotFound e){
			System.out.println(e);
		}
		
		}
	
}

class ObjectNotFound extends Exception {

	ObjectNotFound(String message) {
		super(message);
	}

}

class MyObjectNotFound extends Exception {

	MyObjectNotFound(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

