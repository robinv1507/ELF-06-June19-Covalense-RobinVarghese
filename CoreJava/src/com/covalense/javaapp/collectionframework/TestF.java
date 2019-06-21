package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;

public class TestF {

	public static void main(String[] args) {
		// array list remove() demonstration
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(9.2);
		a.add(1.5);
		a.add(6.9);
		a.add(2.4);
		a.add(3.6);

		System.out.println("Before-->" + a);
		
		boolean ref=a.remove(2.4);//remove the data 
		System.out.println("result "+ref);
		System.out.println("After-->" + a);
	}

}
