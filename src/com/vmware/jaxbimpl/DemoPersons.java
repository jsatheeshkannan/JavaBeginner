package com.vmware.jaxbimpl;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.vmware.reflection.action.Person;

@XmlRootElement
public class DemoPersons {
	List<DemoPerson> person;

	public List<DemoPerson> getPerson() {
		return person;
	}

	public void setPerson(List<DemoPerson> persons) {
		this.person = persons;
	}

	@Override
	public String toString() {
		return "DemoPersons [persons=" + person + "]";
	}
	

}
