package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;

public class TestD {

	public static void main(String[] args) {
		// array list set() demonstration
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(9.2);
		a.add(1.5);
		a.add(6.9);
		a.add(2.4);
		a.add(3.6);

		System.out.println("Before-->" + a);
		Double d = a.set(2, 2.0);// replace the 2.0 into index no 2
		System.out.println("removed object is " + d);

		System.out.println("After-->" + a);
	}

}
