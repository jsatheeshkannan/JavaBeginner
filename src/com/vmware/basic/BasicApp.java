package com.vmware.basic;

import java.io.File;

public class BasicApp {
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		String sp = System.getProperty("user.dir");
		File f1 = new File("targets");
		
			if (f1.exists()) {
				System.out.println("file exists");

			} else {
				System.out.println("app");
				
					try {
						throw new FileException(f1.getName() + " not exists");
					} catch (FileException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			}
		
	}

}
