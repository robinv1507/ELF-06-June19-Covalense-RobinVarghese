package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
/*
 * Generic ArrayList implementation 
 */
public class ArraylistE {

	public static void main(String[] args) {

		ArrayList<Double> a = new ArrayList<Double>();
		a.add(9.2);
		a.add(1.5);
		a.add(6.9);
		a.add(2.4);
		a.add(3.6);

		log.info("Before-->" + a);

		log.info("After-->" + a);

	}//end main
}//end class
