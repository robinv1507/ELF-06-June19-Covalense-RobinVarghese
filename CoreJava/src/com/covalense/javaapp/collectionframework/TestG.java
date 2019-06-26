package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;

public class TestG {

	public static void main(String[] args) {

		ArrayList<Double> a1 = new ArrayList<Double>();
		a1.add(9.2);
		a1.add(1.5);
		
		ArrayList<Double> a2 = new ArrayList<Double>();
		a2.add(2.3);
		a2.add(1.0);

		System.out.println("Before-->" + a1);
		
		a1.addAll(a2);//add all a2 into a1

		System.out.println("After-->" + a1);
	}

}
