package com.vmware.dc1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class EmpInvoker implements InitializingBean{
	private ServiceReq servicereq;
	private Genernal genernal;
	private List<Employer> emps;

	public void g1() {

		servicereq = new ServiceReq();
		genernal = new Genernal();
		emps = new ArrayList<>();
		genernal.setEmps(emps);
		// System.out.println(genernal.getEmps());
		
		Employer e1 = new Employer();
		e1.setCompanyName("vmware");
		e1.setLoc("blr");
		e1.setId("VMW1000");

		Employer e2 = new Employer();
		e2.setCompanyName("cisco");
		e2.setLoc("blr");
		e2.setId("CISCO1000");
		emps.add(e1);
		emps.add(e2);
		// genernal.setEmps(emps);
		System.out.println(e1);
		System.out.println(genernal.getEmps());
		Employee ee1= new Employee();
		ee1.setFname("satheesh");
		ee1.setId(100);
		System.out.println(ee1.toString());
		System.out.println("completed");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("EmpInvoker Init");
		
	}

}
