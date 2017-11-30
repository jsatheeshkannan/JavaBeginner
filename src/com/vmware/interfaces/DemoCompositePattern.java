package com.vmware.interfaces;

public class DemoCompositePattern {
	public static void main(String[] args) {
		Employee emp1 = new BankManager(100, "satheesh", 10000);
		Employee emp2 = new Cashier(101, "kannan", 1000);
		Employee emp3 = new Accountant(102, "ramya", 6000);
		Employee emp4 = new Accountant(103, "dashvanth", 4000);
		
//		emp1.add(emp1);
		emp1.add(emp2);
		emp1.add(emp3);
		emp1.add(emp4);
		System.out.println(emp1.getId());
		emp1.print();
		
		
	}

}
