package com.vmware.thread;

public class ThreadSync {

	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(10);

		Thread t1 = new Thread(new People(p));
		t1.start();
		Thread t2 = new Thread(new Male(p));
		t2.start();

	}

}

class People implements Runnable {

	Person p;

	public People(Person p) {
		this.p = p;
	}

	@Override
	public void run() {
		p.setAge(100);
		System.out.println(p.getAge());
		p.add();

	}

}

class Male implements Runnable {
	Person p;

	public Male(Person p) {
		this.p = p;
	}

	@Override
	public void run() {
		p.setAge(50);
		System.out.println(p.getAge());
		p.add();

	}

}

class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void add() {
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.getAge()*5);
		}
	}

}