package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;

public class TestC {

	public static void main(String[] args) {
		// array list add() demonstration
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(9.2);
		a.add(1.5);
		a.add(6.9);
		a.add(2.4);
		a.add(3.6);

		System.out.println("Before-->" + a);
 
		a.add(2,2.9);//adding to 2 index
		
		System.out.println("After-->" + a);
	}

}
