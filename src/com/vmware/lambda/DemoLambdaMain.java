package com.vmware.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DemoLambdaMain {
	public static void main(String[] args) {
		
		int[] numbersort = { 10,2,1,4,56};
		Arrays.sort(numbersort);
		for(int i:numbersort){
			System.out.println(i);
		}
		Compar c = new Apple();
		System.out.println(c.value());
		// Lambda Usage
		Consumer m = () -> {
			System.out.println("helloworld");
			return "satheesh";
		};
		System.out.println(m.getYear());

		Consumer t = () -> {
			// TODO Auto-generated method stub
			return "Year";
		};
		System.out.println(t.getYear());

		List<Integer> i = Arrays.asList(1, 2, 3, 4);
		i.stream();
		String name = "dashvanth";
		Predicate p = (String s) -> s.length();
		Fruit f = new Fruit();
		f.g1(() -> "myvalue");

		Thread t1 = new Thread(() -> {
			System.out.println("run Method");
		});
		t1.start();
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("new interface call");

			}

		});
		t2.start();
		int[] a = { 4, 2, 5, 1 };
		Arrays.sort(a);
		for (int ij : a) {
			System.out.println(ij);
		}
		Person p1 = new Person("sa", "ka", 34);
		Person p2 = new Person("da", "Van", 20);
		Person p3 = new Person("Ram", "sa", 5);
		Person p4 = new Person("ipm", "sa", 23);
		Person[] af = new Person[4];
		af[0] = p1; af[1] = p2; af[2]=p3;af[3]=p4;
		try{
		Arrays.sort(af);
		}
		catch(java.lang.ClassCastException e){
			e.printStackTrace();
		}
			List<Person> people = Arrays.asList(p1, p2, p3, p4);
		
		System.out.println(people);
		//Collections.sort(people);
		//System.out.println(people);
		
		Collections.sort(people, new Comparator<Person>(){

			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getFname().toLowerCase().compareTo(o2.getFname().toLowerCase());
			}
		});
//		System.out.println("Object:"+people);
		for (Person po : people){
			System.out.println(po);
		}
		
		List<String> namelist = Arrays.asList("take", "come", "sit", "down", "sit");
		Set<String> ts = new TreeSet<>(namelist); // sorted and noduplicate
		System.out.println(ts);

		System.out.println(namelist);
		Collections.sort(namelist);
		System.out.println(namelist);

		/*
		 * Collections.sort(people, new Comparator<Person>() {
		 * 
		 * @Override public int compare(Person o1, Person o2) { // TODO
		 * Auto-generated method stub
		 * System.out.println(o1.getFname().compareTo(o1.getFname())); return
		 * o1.getFname().compareTo(o1.getFname()); } });
		 */

		for (Person p11 : people) {
			System.out.println(p11);
		}

	}

}

class Fruit {
	public void g1(Compar c) {
		System.out.println(c.value());
	}
}

class Apple implements Compar {

	@Override
	public String value() {
		// TODO Auto-generated method stub
		return "zero";
	}

}

class Person  {
	private String fname;
	private String lname;
	private int age;

	public Person(String fname, String lname, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}

}

@FunctionalInterface
interface Months {
	void getMonth();

}

@FunctionalInterface
interface Consumer {
	String getYear();

}

@FunctionalInterface
interface Predicate {
	int getLength(String s);
}