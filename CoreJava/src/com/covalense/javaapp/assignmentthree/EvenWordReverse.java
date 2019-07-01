package com.covalense.javaapp.assignmentthree;

import lombok.extern.java.Log;

/*
 * program to reversing the even position ,
 * words in the given string
 */
@Log
public class EvenWordReverse {// start class

	public static void main(String[] args) {// start main

		String s = "hai my dear friend";
		/*
		 * split() split the string in whitespace,
		 * and  store it each words into array
		 */
		String words[] = s.split(" ");

		String reverseWord = " ";
		for (int i = 0; i <= words.length - 1; i++) {

			if (i % 2 == 1) {// checking word position if even

				reverseWord += words[i] + " ";// storing normal word

			} else {// reversing the word and storing
				StringBuilder sb = new StringBuilder(words[i]);
				sb.reverse();
				reverseWord += sb.toString() + " ";
			}

		}
		
		log.info("words reverse of string - " + s + " -is\n" + reverseWord);
	}// main end

}// class end
