package com.sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ObjectToXMLUtil {
	
	public static boolean createXMLFromObject(List<Person> persons,int l)
	{		 
		try 
		{
		   JAXBContext context;
		   BufferedWriter writer = null;
		  try 
		  {		
			  writer = new BufferedWriter(new FileWriter("C://3bigs/testdata/persons"+Integer.toString(l)+".xml"));
			  context = JAXBContext.newInstance(Persons.class);
		      Marshaller m = context.createMarshaller();
		      m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		      m.marshal(new Persons(persons), writer);
		      writer.close();
		  } 
		  catch (IOException e) 
		  {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		    
		} 
		catch (JAXBException e) 
		{
			e.printStackTrace();
	    }
		return true;
	}
}
