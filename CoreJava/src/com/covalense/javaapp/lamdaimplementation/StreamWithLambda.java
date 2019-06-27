package com.covalense.javaapp.lamdaimplementation;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
/*
 * counting the filter list objects
 */
public class StreamWithLambda {
	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(5);
		a.add(2);
		a.add(6);
		// filtering the arraylist for getting odd numbers
		long t = a.stream().filter(i -> i % 2 == 1).count();
		log.info("number of objects are " + t);
	}

}
