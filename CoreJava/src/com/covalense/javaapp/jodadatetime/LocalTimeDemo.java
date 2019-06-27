package com.covalense.javaapp.jodadatetime;

import java.time.LocalTime;

import lombok.extern.java.Log;

@Log
/*
 * LocalTime features demo programs
 */
public class LocalTimeDemo {
	public static void main(String[] args) {
		
		LocalTime l=LocalTime.now();
		
		log.info("current time "+l);
		log.info("current hour "+l.getHour());
		
		
		
	}//end of main

}//end of class
