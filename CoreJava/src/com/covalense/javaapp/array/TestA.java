package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
/*
 * simple double type array program
 */

public class TestA {

	public static void main(String[] args) {

		double[] a = new double[3];
		a[0] = 1.2;
		a[1] = 20.0;
		a[2] = 3;
		for (int i = 0; i < a.length; i++) {// for loop begin
			log.info("" + a[i]);
		}
	}// end of main

}// end of class
