package com.vmware.design.singleton;

public class SingletonMain {
	public static void main(String[] args) {
		SingletonImpl sf = SingletonImpl.newInstance();
		sf.add();
		SingletonImpl sf2 = SingletonImpl.newInstance();
	}

}
