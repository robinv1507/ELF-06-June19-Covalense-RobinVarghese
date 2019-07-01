package com.covalense.javaapp.stream;

import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
/*
 * Stream interface demo
 */
public class ArrayStream {
	public static void main(String[] args) {

		Integer[] a = { 2, 3, 4, 1 };

		Stream<Integer> s = Stream.of(a);
		//printing the value
		s.forEach(i -> log.info("" + i));
		// Strem dealing with list of values
		Stream<Integer> st = Stream.of(2, 6, 4, 3, 8);
		//st.forEach(i -> log.info("" + i));
		//or printing you can use above statement
		st.forEach(System.out::println);

	}

}//end of class
