package com.covalense.javaapp.assignmentthree;

import lombok.extern.java.Log;

/*
 * Swapping the position of the words in a given string 
 */
@Log
public class StringOperations {// class start

	public static void main(String[] args) {// main start
		// odd number of words in this array s1
		String s1 = "hoga beda hudugi ff nana bittu";
		String[] s = s1.split(" ");

		// if array words are even
		if (s.length % 2 == 0) {
			log.info("can't do the swapping ,because no of words is even");
		} else {
			String temp = s[s.length - 1];
			s[s.length - 1] = s[s.length / 2];
			s[s.length / 2] = s[0];
			s[0] = temp;
		}
		// original string
		log.info(" real string :" + s1);

		// printing the swapped array
		for (String w : s) {
			log.info(w);
		}

	}// main end

}// class end
