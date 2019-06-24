package com.covalense.javaapp.assignmentthree;

import lombok.extern.java.Log;

@Log
/*
 * reversing the words of a string
 */
public class WordReverse {// start class

	public static void main(String[] args) {// start main

		String s = "hai my dear friend";
		/*
		 * split() split the string in whitespace store it each words into array
		 */
		String[] words = s.split(" ");

		String reverseWord = "";
		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord += sb.toString() + " ";
		}
		log.info("words reverse of string - " + s + " -is\n" + reverseWord);
	}// main end

}// class end
