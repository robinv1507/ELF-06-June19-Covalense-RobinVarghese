package com.covalense.javaapp.exception;

public class Validate {
	
	void validator(String s)
	{
		if(s.length()>=5)
		{
			System.out.println(" name is ok");
			
		}
		else
		{
		    throw new CustomStringexception("name is two small ,should be > 5 char");	
		}
	}

}
