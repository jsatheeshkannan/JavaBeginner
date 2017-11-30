package com.vmware.testng.threadgroup;

public class DemoThreadGroupMC implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("["+Thread.currentThread().getName()+"]:mc:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

		
	}

}
