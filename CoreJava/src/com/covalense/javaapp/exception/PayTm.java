package com.covalense.javaapp.exception;

public class PayTm {
	
	IRTC i=new IRTC();
	void getTicket()
	{
		try {
         System.out.println("Getticket method started");
         
         i.book();
		}
		catch(ArithmeticException a)
		{
			System.out.println(" caught exception at getticket()");
			throw a;
			
		}
		
		
		 System.out.println("getticket method End");
	}

}
