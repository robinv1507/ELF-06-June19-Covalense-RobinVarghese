package com.covalense.javaapp.collectionframework.set;

public class Car implements Comparable<Car> {

	String name;
	String brand;
	int cost;
	double rating;

	@Override
	public int compareTo(Car o) {//comparing with name

		return this.name.compareTo(o.name);
	}

}
