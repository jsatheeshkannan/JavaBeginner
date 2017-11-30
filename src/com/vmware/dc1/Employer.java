package com.vmware.dc1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class Employer implements InitializingBean,BeanNameAware,DisposableBean,BeanFactoryPostProcessor{
	private String companyName;
	private String id;
	private String loc;
	
	
	public Employer() {
		System.out.println("Employer constructor:"+this.hashCode());
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getId() {
		return id;
	}
	public void setId(String string) {
		this.id = string;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Employer [companyName=" + companyName + ", id=" + id + ", loc=" + loc + "]";
	}
	@Override
	public void setBeanName(String arg0) {
		System.out.println(arg0);
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Employer init");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("cleaning in employer table");
		
	}
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println("++++++ Employer::BeanFactoryPostProcess::");
		
	}
	

}
