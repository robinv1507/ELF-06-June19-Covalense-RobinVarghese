package com.covalense.javaapp.array;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log

/*
 * array sorting using Arrays.sort()
 */
public class ArraySorting {

	public static void main(String[] args) {

		int[] b = { 5, 2, 1, 4, 3 };
		Arrays.sort(b);
		for (int i = 0; i < b.length; i++) {
			log.info("" + b[i]);
		}

	}// end main

}// end class
