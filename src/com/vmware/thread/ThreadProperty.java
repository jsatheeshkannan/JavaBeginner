package com.vmware.thread;

public class ThreadProperty implements Runnable{

	@Override
	public void run() {
		while(true){
		if(Thread.currentThread().isDaemon()){
			System.out.println("Daemon thread"+Thread.currentThread().getName());
		}else
		{
			System.out.println("user thread!");
		}
		
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}

}
