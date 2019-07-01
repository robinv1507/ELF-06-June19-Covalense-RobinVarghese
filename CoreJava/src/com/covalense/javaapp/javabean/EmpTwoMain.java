package com.covalense.javaapp.javabean;

import java.util.logging.Logger;

public class EmpTwoMain {
	private static final Logger log = Logger.getLogger("printlog");

	public static void main(String[] args) {

		// with Lombok
		EmployeeTwo e1 = new EmployeeTwo();
		e1.setAge(13);
		e1.setName("robin");

		log.info("with lombok==>" + e1.toString());

	}// end main

}// end class
