package com.vmware.singleton;

public class DemoSingletonEx {
	private static DemoSingletonEx e1;
	private static int count;

	private DemoSingletonEx() {
		count++;
		System.out.println(count);
	}

	public static DemoSingletonEx init() {
		if (e1 == null) {
			e1 = new DemoSingletonEx();
		}
		return e1;

	}

	public void getSystem() {
		Runtime r1 = Runtime.getRuntime();
		System.out.println(r1.availableProcessors());
	}

}
