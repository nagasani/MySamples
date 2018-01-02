package com.sample;

import java.io.File;
import java.util.List;

public class XMLFromDelimiter implements XMLConverter 
{
	File f = null;
	String filePath = null;

	public XMLFromDelimiter(String fileLocation)
	{
		try
		{
			f = new File(fileLocation);
			filePath = fileLocation;
			if(!f.exists()) throw new Exception();
		}
		catch(Exception ex)
		{
			System.out.println("File Missing");
			ex.printStackTrace();
		}		
	}
	
	@Override
	public List<Person> convertXML() {
		// TODO Auto-generated method stub
		System.out.println("Converting XML");
		return null;
	}
}