package com.vmware.interfaces;

public class Cashier implements Employee {

	private int id;
	private String name;
	private double salary;
	
	public Cashier(int id, String name, double salary) {
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

	}

	@Override
	public void add(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
