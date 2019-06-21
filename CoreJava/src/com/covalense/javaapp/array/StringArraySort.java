package com.covalense.javaapp.array;

import java.util.Arrays;

public class StringArraySort {//string 

	public static void main(String[] args) {
		String[] b = { "amal", "nilesh", "kalbeesh", "bibin" };
		Arrays.sort(b);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
