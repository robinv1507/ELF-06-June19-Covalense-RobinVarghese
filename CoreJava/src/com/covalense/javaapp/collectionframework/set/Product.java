package com.covalense.javaapp.collectionframework.set;

public class Product implements Comparable<Product> {
	String name;
	int cost;
	double rating;

	@Override
	public int compareTo(Product o) {//comparing with rating
		
		if (this.rating < o.rating) {
			return -1;
		} else if (this.rating > o.rating) {
			return 1;
		} else {
			return 0;
		}

	}

}
