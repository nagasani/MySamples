package com.sample;

public class XMLFactory {
	
	public static XMLConverter getXMLConverter(String fileLocation,String delimiter)
	{	
		XMLConverter xml = null;
	
		if( delimiter.equals(","))
		{
			xml = new XMLFromSpecialCharComma(fileLocation);
		}
		if(delimiter.equals("|"))
		{
			xml = new XMLFromSpecialCharPipe(fileLocation);
		}
		else if(delimiter.equals("	"))
		{
			xml = new XMLFromTabSpace(fileLocation);
		}
		return xml;
	}
}