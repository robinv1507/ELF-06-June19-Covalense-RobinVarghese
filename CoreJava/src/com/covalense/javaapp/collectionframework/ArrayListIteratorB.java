package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;
import java.util.ListIterator;

/*
 * Arraylist0 implementation using *List iterator*
 */
public class ArrayListIteratorB {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add("robin");
		a.add(1);
		a.add(2.2);
		a.add('x');

		// displaying the arrayList using LisIterator
		ListIterator lit = a.listIterator(a.size());

		System.out.println("---<backword array----");

		while (lit.hasPrevious()) {
			Object r = lit.previous();
			System.out.println(r);
		}
	}//end main
}//end class
