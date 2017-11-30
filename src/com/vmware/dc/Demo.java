package com.vmware.dc;

public class Demo {
int i;
int j;
public void add(){
	System.out.println(i+j);
	Fruit n = new Fruit();
	n.getfId();
	System.out.println("add method compleeted");
}
@Override
protected Object clone() throws CloneNotSupportedException {
	
	return super.clone();
}



}
