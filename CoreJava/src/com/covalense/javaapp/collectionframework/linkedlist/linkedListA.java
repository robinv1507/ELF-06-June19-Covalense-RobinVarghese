package com.covalense.javaapp.collectionframework.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedListA {//non generic linked list implementation

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.add(2);
		l.add(2.3);
		l.add("nilesh");

		System.out.println(l);// simple display

		for (int i = 0; i < l.size(); i++)// for loop display linked list
		{

			Object r = l.get(i);
			System.out.println(r);
		}
		System.out.println("********");
		for (Object r : l)// using for each loop
		{
			System.out.println(r);

		}
		System.out.println("********");

		// using iterator

		Iterator i = l.iterator();

		while (i.hasNext()) {
			Object obj = i.next();
			System.out.println(obj);
		}
		System.out.println("********");

		// using List iterator

		ListIterator k = l.listIterator();

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
