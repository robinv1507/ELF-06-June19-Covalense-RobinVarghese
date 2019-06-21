package com.covalense.javaapp.array;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {

		int temp;
		int[] b = { 5, 2, 1, 4, 3 };
		Arrays.sort(b);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
