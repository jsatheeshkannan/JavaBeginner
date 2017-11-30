package com.vmware.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankManager implements Employee {
	private int id;
	private String name;
	private double salary;
	List<Employee> Employees = new ArrayList<Employee>();

	public BankManager(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public void print() {
		System.out.println("============================");
		System.out.println(getSalary());
		System.out.println(getName());
		System.out.println(getId());
		System.out.println("============================");
		Iterator<Employee> itr1 = Employees.iterator();
		while (itr1.hasNext()) {
			Employee e = itr1.next();
			e.print();
		}

	}

	@Override
	public void add(Employee e) {
		Employees.add(e);

	}

	@Override
	public void remove(Employee e) {
		Employees.remove(e);

	}

	@Override
	public Employee getChild(int i) {
		return Employees.get(i);

	}

}
