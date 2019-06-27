package com.covalense.javaapp.methodreferenceoperator;

import lombok.extern.java.Log;

@Log
/*
 *non static method reference operator demo
 * 
 */
public class TesTFact {

	public static void main(String[] args) {
        /*
         * functional interface referring,
         *  the non static method of another class
         */
		Math m=new Math();
		MyFactorial a = m::factorial;
		int fact = a.getFact(5);
		log.info("factorial is " + fact);

	}//end of main

}//end of class
