package com.covalense.javaapp.assignmentthree;

import lombok.extern.java.Log;

@Log
// program to reverse of given string

public class SringReverse {// class start
	// string reverse method
	private static void stringReverse(String s) {

		String rev = " ";
		int i;
		int length;
		length = s.length();
		for (i = length - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		log.info("Reverse of Entered String is : " + rev);

	}

	public static void main(String[] args) {// main start

		String s = "how are you doing";
		log.info("original string is :" + s);
		stringReverse(s);

	}// main end

}// class end
