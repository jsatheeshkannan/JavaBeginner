package com.vmware.dc1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Genernal {
	//@Autowired
	private List<Employer> emps;

	public List<Employer> getEmps() {
		return emps;
	}

	public void setEmps(List<Employer> emps) {
		this.emps = emps;
	}
	

}
