package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
/*
 * string array simple program
 */
public class TestC {

	public static void main(String[] args) {

		String[] s = new String[3];
		s[0] = "amal";
		s[1] = "binu";
		s[2] = "cibin";
		log.info("" + "array length is" + s.length);
		for (int i = 0; i < s.length; i++) {
			log.info("" + s[i]);
		}

	}//end main

}//end class
