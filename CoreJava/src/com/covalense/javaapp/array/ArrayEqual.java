package com.covalense.javaapp.array;

import java.util.Arrays;

public class ArrayEqual {// checking array elements using Arrays.equals()

	public static void main(String[] args) {
		int[] arr1 = { 1, 0, 3 };
		int[] arr2 = { 1, 2, 3 };
		if (Arrays.equals(arr1, arr2))
			System.out.println("Same");
		else
			System.out.println("Not same");
	}

}
