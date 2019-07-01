package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
/*
 * searching the array element
 */
public class SearchArray {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };
		int toFind = 0;
		boolean found = false;

		for (int n : num) {
			if (n == toFind) {
				found = true;
				break;
			}
		} // end for loop

		if (found)
			log.info("" + toFind + " is found.");
		else
			log.info("" + toFind + " is not found.");

	}// end main

}// end class
