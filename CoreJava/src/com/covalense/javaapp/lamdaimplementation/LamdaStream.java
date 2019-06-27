package com.covalense.javaapp.lamdaimplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
/*
 * filteration using stream concept
 */
public class LamdaStream {
	public static void main(String[] args) {
		

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(5);
		a.add(2);
		a.add(6);
		//filtering the arraylist for getting odd numbers
		List<Integer> x=a.stream().filter(i->i%2==1).collect(Collectors.toList());
		
		log.info(""+x);
		
	}

}
