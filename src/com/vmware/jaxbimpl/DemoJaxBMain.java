package com.vmware.jaxbimpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.io.input.XmlStreamReader;
import org.eclipse.persistence.jaxb.MarshallerProperties;
import org.eclipse.persistence.jaxb.UnmarshallerProperties;
import org.eclipse.persistence.oxm.MediaType;

import com.google.gson.Gson;
import com.vmware.reflection.action.Person;

public class DemoJaxBMain {
	public static void main(String[] args) {
		System.setProperty("javax.xml.bind.context.factory", "org.eclipse.persistence.jaxb.JAXBContextFactory");
		//javax.xml.bind.context.factory=org.eclipse.persistence.jaxb.JAXBContextFactory
		DemoPerson p = new DemoPerson();
		p.setEmpid(11636);
		p.setFname("satheesh");
		p.setLname("kannan");
		DemoPerson p1 = new DemoPerson();
		p1.setEmpid(11636);
		p1.setFname("dashvanth");
		p1.setLname("kannan");
		List<DemoPerson> pers=new ArrayList<DemoPerson>();
		pers.add(p);
		pers.add(p1);
		DemoPersons p0 = new DemoPersons();
		p0.setPerson(pers);
		try {
			File f1 = new File("abs.txt");
			FileOutputStream os = new FileOutputStream(f1);
			JAXBContext j = JAXBContext.newInstance(DemoPersons.class);
			Marshaller m1 = j.createMarshaller();
			m1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			m1.setProperty(MarshallerProperties.MEDIA_TYPE,MediaType.APPLICATION_JSON);
			m1.setProperty(MarshallerProperties.JSON_INCLUDE_ROOT, true);
			m1.marshal(p0, System.out);
			m1.marshal(p0, os);
		} catch (JAXBException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File fp = new File("abs.txt");
		try {
			FileInputStream fs = new FileInputStream(fp);
			InputStreamReader rs = new InputStreamReader(fs);
			JAXBContext jc1 = JAXBContext.newInstance(DemoPersons.class);
			Unmarshaller um = jc1.createUnmarshaller();
			//DemoPerson p1 =(DemoPerson) um.unmarshal(fp);
			
			//XmlStreamReader r = new XmlStreamReader(fp);
			um.setProperty(UnmarshallerProperties.MEDIA_TYPE, MediaType.APPLICATION_JSON);
			DemoPersons p11 =(DemoPersons)um.unmarshal(fs);
			System.out.println(p11.toString());
		} catch (JAXBException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String str1="{\"employee\":{\"id\":1,\"name\":\"Ashraf\",\"skills\":[\"java\",\"sql\"]}}";
		
		Gson g = new Gson();
		
   

	}

}
