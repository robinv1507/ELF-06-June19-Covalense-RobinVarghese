package com.covalense.javaapp.lamda;

import java.util.function.Predicate;

import lombok.extern.java.Log;
@Log
/**
 * 
 * checking the given string length is > 5
 * using predicate lambda interface 
 *
 */
public class FindLenght {
	public static void main(String[] args) {
		
		Predicate<String> s=a->a.length()>=5;
		

		boolean x=s.test("hi ");
		log.info(" "+x);
	}//end of main

}//end of class
