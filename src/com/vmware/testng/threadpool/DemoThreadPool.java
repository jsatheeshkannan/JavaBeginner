package com.vmware.testng.threadpool;

public class DemoThreadPool implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("["+Thread.currentThread().getName()+"]:vsan:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}
