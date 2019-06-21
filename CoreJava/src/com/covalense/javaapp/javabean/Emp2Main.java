package com.covalense.javaapp.javabean;

import java.util.logging.Logger;

public class Emp2Main {
	private static final Logger log = Logger.getLogger("printlog");

	public static void main(String[] args) {

		// with Lombok
		Employee2 e1 = new Employee2();
		e1.setAge(13);
		e1.setName("robin");

		log.info("with lombok==>" + e1.toString());

	}// end main

}// end class
