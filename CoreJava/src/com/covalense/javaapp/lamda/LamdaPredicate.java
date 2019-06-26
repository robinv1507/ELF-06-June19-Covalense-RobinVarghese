package com.covalense.javaapp.lamda;

import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
/**
 *printing  array element greater than 4 
 *using predicated Lambda expression
 * 
 *
 */
public class LamdaPredicate {
	public static void main(String[] args) {

		int[] b = { 2, 5, 9, 6, 8 };
		Predicate<Integer> p = a -> a > 4;
		for (int i = 0; i < b.length; i++) {

			if (p.test(b[i])) {
				log.info("" + b[i]);
			}
		}
	}

}
