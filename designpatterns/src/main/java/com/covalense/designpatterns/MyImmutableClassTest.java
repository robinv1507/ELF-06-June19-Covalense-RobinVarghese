package com.covalense.designpatterns;

import lombok.extern.java.Log;

@Log
/*
 * immutable class demo
 */
public class MyImmutableClassTest {

	public static void main(String[] args) {

		MYImmutableClass immutableClass=null;
		immutableClass= new MYImmutableClass("ciyaz", 20, 75598769070l);

		log.info("Name :" + immutableClass.getName());
		log.info("Age :" + immutableClass.getAge());

		 immutableClass = new MYImmutableClass("riyaz", 20, 75598769070l);

		log.info("Name :" + immutableClass.getName());
		log.info("Age :" + immutableClass.getAge());

	}// end of main

}// end of class
