package com.covalense.javaapp.collectionframework.vector;

import java.util.Iterator;

import java.util.ListIterator;
import java.util.Vector;

public class VectorA {
	// non generic vector implementation

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(2);
		v.add(2.3);
		v.add("nilesh");

		System.out.println(v);// simple display

		for (int i = 0; i < v.size(); i++)// for loop display linked list
		{

			Object r = v.get(i);
			System.out.println(r);
		}
		System.out.println("********");
		for (Object r : v)// using for each loop
		{
			System.out.println(r);

		}
		System.out.println("********");

		// using iterator

		Iterator i = v.iterator();

		while (i.hasNext()) {
			Object obj = i.next();
			System.out.println(obj);
		}
		System.out.println("********");

		// using List iterator

		ListIterator k = v.listIterator();

		System.out.println("list iterator");
		while (k.hasNext()) {
			Object o = k.next();
			System.out.println(o);
		}
		System.out.println("back word\n");

		while (k.hasPrevious()) {
			Object o = k.previous();
			System.out.println(o);
		}

	}

}
