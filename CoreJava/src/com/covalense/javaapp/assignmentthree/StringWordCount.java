package com.covalense.javaapp.assignmentthree;

import lombok.extern.java.Log;

@Log
/*
 * counting the words of string
 */
public class StringWordCount {

	public static void main(String[] args) {

		String s = "hai my dear friends";
		/*
		 * split() split the string in whitespace store it each words into array
		 */
		String words[] = s.split(" ");

		for (int i = 0; i < words.length; i++) {
			/*
			 * taking one word from the array and append with length and ' '
			 */
			words[i] = words[i] + words[i].length() + ' ';

			log.info("" + words[i]);
		} // for loop end

	}// main end

}// end class
