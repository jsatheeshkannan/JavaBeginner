package com.vmware.reflection.action;
@SimpleAnnotation
public class Person extends AbstractPerson implements PersonInf{
	private Weak w;
	private int id=10;
	private String name="temp";
	private String secretName="ca$hcow";
	
	private void getSecretName(String sname){
		this.secretName=sname;
		
		System.out.println("private:"+secretName);
	}
	public void getName(String name,int id,Weak w){
		this.w = w;
		w.game();
		this.name = name;
		System.out.println(VERSION);
		//VERSION="10.0";
		System.out.println("public:"+name+":"+id);
	}
	//@SimpleAnnotation
	public void getAnno(){
		System.out.println("getAnno");
	}
	public void g1(){
		System.out.println("g1 method public");
	}
	private void g2(){
		System.out.println("g2 method private");
	}
}
