package com.sample;

import java.util.List;

public class XMLConverterTest 
{
	public static void main(String[] args) 
	{
		XMLConverter xmlDest = XMLFactory.getXMLConverter("C:/3Bigs/testdata/tt.txt",",");
		int l=1;
		while(XMLFromSpecialCharComma.hasMore)
		{
			List<Person> lst = xmlDest.convertXML();
			System.out.println(XMLFromSpecialCharComma.j);
			ObjectToXMLUtil.createXMLFromObject(lst,l);
			l++;
		}
	}
}