package com.covalense.jdbcapp.common;

public class MainMethodClass {

	public static void main(String[] args) {

		
		
		Connection ref=MyClass.getInstance(args[0]);
		ref.printMessage();
		
		
		
		
	}//end of main

}//end of class
