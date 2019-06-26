package com.covalense.javaapp.lamdaimplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
/*
 * stream-map demo 
 * multipling array list element by 2
 */
public class MapStreamLamda {
	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(5);
		a.add(2);
		a.add(6);
		//multipling array list element by 2
		List<Integer> x = a.stream().map(i -> i * 2).collect(Collectors.toList());

		log.info("" + x);

	}//end of main

}//end of class
