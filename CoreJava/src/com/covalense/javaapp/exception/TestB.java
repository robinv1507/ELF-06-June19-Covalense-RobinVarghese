package com.covalense.javaapp.exception;
/*
 * EustomStringException demo
 * validating the given name
 * and throw the exception
 */
public class TestB {

	public static void main(String[] args) {

		Validate v=new Validate();
		String s="ro";
		try {
		v.validator(s);
		}
		catch(CustomStringexception e)
		{
			System.out.println(e);
		}
	}//end main

}//end class
