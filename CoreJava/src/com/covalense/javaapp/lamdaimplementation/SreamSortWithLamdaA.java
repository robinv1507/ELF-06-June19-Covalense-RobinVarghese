package com.covalense.javaapp.lamdaimplementation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
/*
 * sorting and printing the arraylist
 */
public class SreamSortWithLamdaA {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(5);
		a.add(2);
		a.add(6);
		a.add(6);
		Comparator<Integer> c = (i, j) -> i.compareTo(j) * -1;
		List<Integer> x = a.stream().sorted(c).collect(Collectors.toList());

		a.stream().forEach(i -> log.info("" + i));
		log.info("***descending order*****");

		x.forEach(i -> log.info("" + i));

	}// end of main

}// end odf class
