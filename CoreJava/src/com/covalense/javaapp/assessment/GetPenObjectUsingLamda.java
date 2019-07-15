package com.covalense.javaapp.assessment;

import java.util.function.Supplier;

import lombok.extern.java.Log;
@Log
/*
 * 16)	WAP to get the object (object of Pen)
 * using lambda expression
 */
public class GetPenObjectUsingLamda {

	public static void main(String[] args) {

		Supplier<Pen> pen=()-> new Pen("cello",23.3);
		// get the object (object of Pen)
		Object mypen= pen.get();
		
	log.info(""+mypen.toString());

	}// end of main

}// end of class
