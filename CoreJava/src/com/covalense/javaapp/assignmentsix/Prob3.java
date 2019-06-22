package com.covalense.javaapp.assignmentsix;

import lombok.extern.java.Log;

@Log
/*
 * program to print message using lamda expression
 */
public class Prob3 {
	public static void main(String[] args) {
		Message res = s -> {
			log.info(" " + s);

		};

		res.printMessage(" this is my message 1");

	}//end main

}//end class
