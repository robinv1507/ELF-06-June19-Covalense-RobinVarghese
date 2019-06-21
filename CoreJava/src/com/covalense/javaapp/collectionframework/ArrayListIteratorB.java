package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListIteratorB {

	public static void main(String[] args) {

		/*
		 * Arraylist0 implementation using *List iterator*
		 */

		ArrayList a = new ArrayList();
		a.add("robin");
		a.add(1);
		a.add(2.2);
		a.add('x');

		ListIterator lit = a.listIterator(a.size());

		System.out.println("---<backword array----");

		while (lit.hasPrevious()) {
			Object r = lit.previous();
			System.out.println(r);
		}
	}
}
