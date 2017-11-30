package com.vmware.testng.threadpool;

public class DemoThreadVc implements Runnable {
	private int i;

	public DemoThreadVc(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("[" + Thread.currentThread().getName() + "]:vc:" + i+":"+this.i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}
