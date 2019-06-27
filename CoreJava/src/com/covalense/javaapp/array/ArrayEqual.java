package com.covalense.javaapp.array;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log

/*
 * checking array elements using Arrays.equals()
 */
public class ArrayEqual {

	public static void main(String[] args) {
		int[] arr1 = { 1, 0, 3 };
		int[] arr2 = { 1, 2, 3 };
		if (Arrays.equals(arr1, arr2))
			log.info("Same");
		else
			log.info("Not same");
	}//end main

}//end class
