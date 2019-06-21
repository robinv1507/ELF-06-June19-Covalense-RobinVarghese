package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListD {

	public static void main(String[] args) {

		/*
		 * Generic Arraylist0 implementation using * iterator*
		 */

		ArrayList<Double> a = new ArrayList<Double>();
		a.add(1.2);
		a.add(1.3);
		a.add(2.2);
		a.add(2.3);

		Iterator<Double> it=a.iterator();
		while(it.hasNext())
		{
			Double d=it.next();
			System.out.println(d);
		}

	}
}
