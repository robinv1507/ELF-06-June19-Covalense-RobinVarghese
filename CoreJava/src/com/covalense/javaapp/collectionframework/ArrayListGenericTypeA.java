package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;

public class ArrayListGenericTypeA {

	public static void main(String[] args) {

		/*
		 * Arraylist0 implementation using *List iterator*
		 */

		ArrayList<Double> a = new ArrayList<Double>();
		a.add(1.2);
		a.add(1.3);
		a.add(2.2);
		a.add(2.3);

		for (Double r : a) {
			System.out.println(r);
		}
	}
}
