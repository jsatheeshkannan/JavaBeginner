package com.vmware.testng.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoThreadPoolMain {
	public static void main(String[] args) {
		/*Thread d1 = new Thread(new DemoThreadPool());
		Thread d2 = new Thread(new DemoThreadPool());
		Thread d3 = new Thread(new DemoThreadPool());

		d1.start();
		d2.start();
		d3.start();*/

		ExecutorService service1 = Executors.newFixedThreadPool(100);
		for (int i = 0; i < 10; i++) {
			service1.execute(new DemoThreadPool());
		}
		
		for (int i = 0; i < 5; i++) {
			service1.execute(new DemoThreadVc(i));
		}
		service1.shutdown();
		while(!service1.isTerminated()){
			System.out.println("ThreadOnGoing");
		}
		System.out.println("main completed!");
	}
}
