package com.vmware.dc1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class Employee implements InitializingBean,BeanNameAware,DisposableBean,BeanPostProcessor,BeanFactoryPostProcessor{
	private int id;
	private String fname;
	private String lname;
	
	public Employee() {
		System.out.println("employee constructor:"+this.hashCode());
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Employee init");
		
	}
	@Override
	public void setBeanName(String arg0) {
		System.out.println(arg0);
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("closing employee table");
		
	}
	//@de
	public void myEmployeeInit(){
		System.out.println("Employee custome init Method invocation");
	}
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println();
		System.out.printf("========>  postprocAfterInit %s \n",arg1,arg0);
		return arg0;
	}
	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.printf("========>  postprocBeforeInit %s  \n",arg1,arg0);
		return arg0;
	}
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println("+++++++++Employee::BeanFactoryPostProcess::"+arg0);
		
	}
	@PostConstruct
	public void initPost(){
		System.out.println("postConstruct");
	}
	@PreDestroy
	public void preDestory(){
		System.out.println("preDestroy action");
	}
	
	

}
