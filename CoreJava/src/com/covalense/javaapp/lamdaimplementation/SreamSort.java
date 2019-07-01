package com.covalense.javaapp.lamdaimplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
/*
 * sorting the arraylist
 */
public class SreamSort {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(5);
		a.add(2);
		a.add(6);
		List<Integer> x = a.stream().sorted().collect(Collectors.toList());
		log.info("number of objects are " + x);
	}

}
