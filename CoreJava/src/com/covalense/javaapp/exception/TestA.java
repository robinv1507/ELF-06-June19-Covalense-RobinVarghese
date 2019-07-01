package com.covalense.javaapp.exception;

public class TestA {

	public static void main(String[] args) {

		PayTm p=new PayTm();
		
		try {
			p.getTicket();
		}
		catch(ArithmeticException q)
		{
			System.out.println("caught exception at main ()");
		}
		
	
		
	}

}
