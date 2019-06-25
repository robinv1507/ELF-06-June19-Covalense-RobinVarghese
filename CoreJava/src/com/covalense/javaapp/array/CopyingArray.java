package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log

public class CopyingArray {

	public static void main(String[] args) {

		int a[] = { 1, 8, 3 };

		// Create an array b[] of same size as a[]
		int[] b = new int[a.length];

		// Doesn't copy elements of a[] to b[], only makes
		// b refer to same location
		b = a;

		// Change to b[] will also reflect in a[] as 'a' and
		// 'b' refer to same location.
		b[0]++;

		log.info("" + "Contents of a[] ");
		for (int i = 0; i < a.length; i++)
			log.info("" + a[i] + " ");

		log.info("\n\nContents of b[] ");
		for (int i = 0; i < b.length; i++)
			log.info("" + b[i] + " ");
	}
}
