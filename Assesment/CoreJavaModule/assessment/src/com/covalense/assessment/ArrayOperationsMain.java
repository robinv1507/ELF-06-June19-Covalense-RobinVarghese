package com.covalense.assessment;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log
/*
 * a. WAP to sort the array elements
 *  b. to search the element in array 
 *  c. to compare two arrays 
 *  d. copy the content of one array to other
 *   e. copy only elements of array from 3rd index to 6th index from parent array to child
 * array
 */
public class ArrayOperationsMain {
	public static void main(String[] args) {

		int[] a = { 2, 6, 87, 8, 7, 5, 6, 5 };
		int[] b = { 3, 4, 87, 8, 1, 2, 3, 6 };
		int[] c=new int[8] ;

		// sorting array element
		Arrays.sort(a);
		// displaying the sorted array
		log.info("sorted array element ");
		for (int p : a) {
			log.info(" " + p);
		}

		// to search the element in array
		int searchElement=6;
		log.info("searching element is" + Arrays.binarySearch(a,searchElement));

		// copy the content of one array to other

		Arrays.copyOf(a, c[0]);
		log.info("copied array element ");
		// displaying the copied array
		for (int p : a) {
			log.info(" " + p);
		}

		// copy only elements of array from 3rd index to 6th index from parent array to
		// child array
		System.arraycopy(a, 3, b, 6, b.length - 6);

	}// end of main

}// end of class
