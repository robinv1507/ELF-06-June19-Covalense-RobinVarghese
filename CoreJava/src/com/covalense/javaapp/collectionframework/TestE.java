package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;

public class TestE {

	public static void main(String[] args) {
		// array list remove() demonstration
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(9.2);
		a.add(1.5);
		a.add(6.9);
		a.add(2.4);
		a.add(3.6);

		System.out.println("Before-->" + a);
		Double d=a.remove(1);//remove the data in 1 index
		System.out.println("removed object is "+d);
		System.out.println("After-->" + a);
	}

}
