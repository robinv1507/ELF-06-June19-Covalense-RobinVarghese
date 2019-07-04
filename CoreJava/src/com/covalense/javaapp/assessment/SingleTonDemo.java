package com.covalense.javaapp.assessment;
/*
 *Program to create the singleton class.
 */
public class SingleTonDemo {
	public static void main(String[] args) {
		
		
		//taking the  SingleTon class reference object
		 SingleTon ref= SingleTon.getInstance();
		 
		 /*
		  *using SingleTon class reference object,
		  *calling method of that class
		  */
		
		 ref.print();
	
		
	}//end of main

}//end of class
