package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
/*
 * simple char type array program
 */

public class TestB {
	public static void main(String[] args) {

		char[] c = new char[6];
		c[0] = 'r';
		c[1] = 'o';
		c[2] = 'b';
		c[3] = 'i';
		c[4] = 'n';
		for (int i = 0; i < c.length; i++) {
			log.info("" + c[i]);
		}
	}//end main

}//end class
