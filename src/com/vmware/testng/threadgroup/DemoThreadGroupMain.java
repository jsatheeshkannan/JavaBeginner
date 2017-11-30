package com.vmware.testng.threadgroup;

import java.time.LocalDateTime;

public class DemoThreadGroupMain {
	public static void main(String[] args) {
		ThreadGroup tg1 = new ThreadGroup("Extender-Service");
		Thread t1 = new Thread(tg1,new DemoThreadGroupMM(),"mm-cloud");
		Thread t2 = new Thread(tg1,new DemoThreadGroupMC(),"mc-onprem");
		Thread t3 = new Thread(tg1,new DemoThreadGroupMC(),"mc-onprem2");
		tg1.setMaxPriority(8);
		t1.start();
		t2.start();
		t3.setDaemon(true);
		t3.start();
		
		
		
		ThreadGroup tg2= new ThreadGroup("DR2C");
		Thread t11 = new Thread(tg2,new DemoThreadGroupMM(),"dr2c-cloud");
		Thread t22= new Thread(tg2,new DemoThreadGroupMC(),"dr2c-onprem");
		Thread t33 = new Thread(tg2,new DemoThreadGroupMC(),"dr2c-onprem2");
		tg2.list();
		tg1.list();
		t11.start();t22.start();t33.start();
		
		System.out.println(tg1.getName());
		System.out.println(tg1.activeCount()+":"+tg2.activeCount());
		if(t3.isDaemon()){
			System.out.println("Yes, it is a DaemonThread");
		}else{
			System.out.println("No,it is UserThread");
		}
		
		System.out.println(LocalDateTime.now());
		
	}

}
