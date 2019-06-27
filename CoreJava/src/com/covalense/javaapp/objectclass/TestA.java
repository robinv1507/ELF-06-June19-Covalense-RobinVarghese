package com.covalense.javaapp.objectclass;

import lombok.extern.java.Log;

@Log
/*
 * object class methods demo programs,
 *  equals(),hashCode()
 */
public class TestA {

	public static void main(String[] args) {

		Student s1 = new Student("nilesh", 20);
		Student s2 = new Student("nilesh", 2);

		log.info("" + s1.equals(s2));
		log.info("" + s1);// will print s1 class members with the help of toSting()
		log.info("" + s1.hashCode());
		log.info("" + s2.hashCode());// will show s2 object integer address

	}//end of the main

}//end of the class
