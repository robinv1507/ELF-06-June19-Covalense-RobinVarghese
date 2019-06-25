package com.covalense.javaapp.collectionframework.set;

import java.util.TreeSet;

public class ProductMain {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.name = "mi a2";
		p1.cost = 20000;
		p1.rating = 2.4;

		Product p2 = new Product();
		p2.name = "mi a1";
		p2.cost = 10000;
		p2.rating = 2.9;

		Product p3 = new Product();
		p3.name = "mi note pro";
		p3.cost = 15000;
		p3.rating = 4.9;

		TreeSet<Product> h = new TreeSet<Product>();
		h.add(p1);
		h.add(p2);
		h.add(p3);

		for (Product p : h) {

			System.out.println("Name is " + p.name);
			System.out.println("cost is " + p.cost);
			System.out.println(" Rating is " + p.rating);
			System.out.println("*******");

		}

	}

}
