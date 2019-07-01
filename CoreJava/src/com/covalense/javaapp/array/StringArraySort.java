package com.covalense.javaapp.array;

import java.util.Arrays;
import lombok.extern.java.Log;

@Log
/*
 * string array sorting using, Array.sort()
 */
public class StringArraySort {// string

	public static void main(String[] args) {
		String[] b = { "amal", "nilesh", "kalbeesh", "bibin" };
		Arrays.sort(b);
		for (int i = 0; i < b.length; i++) {
			log.info("" + b[i]);
		}
	}//end main
}//end class
