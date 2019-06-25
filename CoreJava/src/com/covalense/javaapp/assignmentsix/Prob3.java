package com.covalense.javaapp.assignmentsix;

import lombok.extern.java.Log;

@Log
/*
 * program to print message using lamda expression
 */
public class Prob3 {
	public static void main(String[] args) {
		Message res = () -> {
			log.info(" this is my message 1" );

		};

		res.printMessage();

	}//end main

}//end class
