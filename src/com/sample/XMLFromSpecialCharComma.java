package com.sample;

import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class XMLFromSpecialCharComma extends XMLFromDelimiter {
	
	List <Person> persons = null;
	public static boolean hasMore = true;
	public static int j=0;

	public XMLFromSpecialCharComma(String fileLocation) {
		super(fileLocation);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Person> convertXML() 
	{
		persons = new LinkedList<>();
		int k = 0;
		try
		{	
			FileInputStream inputStream = null;
			Scanner sc = null;
			try 
			{
			    inputStream = new FileInputStream(filePath);
			    inputStream.skip(j*1000);
			    sc = new Scanner(inputStream, "UTF-8");
			    while (sc.hasNextLine()) 
			    {
			        String line = sc.nextLine();
			        System.out.println(line);
			        while (line != null)
					{
						Person pns = new Person();
						//System.out.println(line);
						StringTokenizer st = new StringTokenizer(line, ",");
						while (st.hasMoreElements()) 
						{
							pns.setName(st.nextElement().toString());
							pns.setAge(Integer.parseInt(st.nextElement().toString()));
							pns.setPhone(st.nextElement().toString());
							//persons.add(pns);
							System.out.println(k);
							k++;
							if(k == 1000)
							{
								hasMore = true;
								//break;	
								j++;
								return persons;
							}
						}
					}
			    }
			    // note that Scanner suppresses exceptions
			    if (sc.ioException() != null) 
			    {
			        throw sc.ioException();
			    }
			} 
			finally 
			{
			    if (inputStream != null) 
			    {
			        inputStream.close();
			    }
			    if (sc != null) 
			    {
			        sc.close();
			    }
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return persons;
	}
}