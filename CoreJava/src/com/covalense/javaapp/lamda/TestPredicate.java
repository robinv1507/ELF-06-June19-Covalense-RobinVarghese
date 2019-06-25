package com.covalense.javaapp.lamda;

import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
/*
 * even or not
 */
public class TestPredicate {
	public static void main(String[] args) {

		Predicate<Integer> p = a -> a % 2 == 0;

		boolean x = p.test(12);

		log.info(" " + x);

	}
}
