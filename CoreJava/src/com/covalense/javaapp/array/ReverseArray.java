package com.covalense.javaapp.array;

import java.util.Arrays;
import java.util.Collections;

import lombok.extern.java.Log;

@Log

public class ReverseArray {// array descending order sorting

	public static void main(String[] args) {

		Integer[] b = { 5, 2, 1, 4, 3 };

		/* sort the integer array into reverse order */

		Arrays.sort(b, Collections.reverseOrder());

		for (int i : b) {
			log.info("" + i);
		}
	}

}
