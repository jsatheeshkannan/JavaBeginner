package com.vmware.singleton;

public class DemoSingletonMain {
	public static void main(String[] args) {
		DemoSingletonEx e1 = DemoSingletonEx.init();
		DemoSingletonEx e2 = DemoSingletonEx.init();
		DemoSingletonEx e3 = DemoSingletonEx.init();
		DemoSingletonEx e4 = DemoSingletonEx.init();
		DemoSingletonEx e5 = DemoSingletonEx.init();
		DemoSingletonEx e6 = DemoSingletonEx.init();
		e1.getSystem();
	}

}
