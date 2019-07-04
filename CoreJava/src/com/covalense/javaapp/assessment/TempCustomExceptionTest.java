package com.covalense.javaapp.assessment;

import lombok.extern.java.Log;

@Log
/*
 * 24) WAP to create a custom exception to validate the temperature of , the
 * server room. (Eg: If the temperature is more that 18 degrees, there should be
 * an exception)
 *
 */
public class TempCustomExceptionTest {

	public static void main(String[] args) {

		double temp = 45.00;

		Temperature temperature = new Temperature();

		try {

			temperature.validateServerRoomTemp(temp);
			
		} catch (TempCustomException e) {
			log.severe("" + e);
		}

	}// end of main

}// end of class
