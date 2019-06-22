package com.as3;

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

			System.out.print(words[i]);
		}

	}

}
