package com.vmware.reflection.action;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;

public class InvokePublic {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class<Person> c = Person.class;
		Person pp = new Person();
		Weak wt = new Weak();
		pp.getName("de", 100,wt);
		Person ps = (Person)c.newInstance();
		//Person p = (Person) c.newInstance();
		/*for (Method m1 : c.getMethods()) {
			System.out.println(m1.getName());
		}*/
		System.out.println(c.getName());
		System.out.println(c.getSuperclass());
		System.out.println(c.asSubclass(Person.class));
		System.out.println(c.getInterfaces()[0]);
		System.out.println(c.getAnnotation(SimpleAnnotation.class));
		
	
		Method md = c.getDeclaredMethod("g1", null);
		//md.setAccessible(true);
		md.invoke(ps, null);
		
		md = c.getDeclaredMethod("g2", null);
		md.setAccessible(true);
		md.invoke(ps, null);
		Class[] c1 = new Class[]{String.class,int.class,Weak.class};
		md = c.getDeclaredMethod("getName", c1);
		md.invoke(ps, "volvo",10,wt);
	}
}
