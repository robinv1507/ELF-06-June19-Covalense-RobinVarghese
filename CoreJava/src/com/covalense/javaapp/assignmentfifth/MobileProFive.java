package com.covalense.javaapp.assignmentfifth;

public class MobileProFive implements Comparable<MobileProFive> {
	String name;
	double cost;
	String brand;

	void set(String name, double cost, String brand) {
		this.name = name;
		this.cost = cost;
		this.brand = brand;
	}

	@Override
	public int compareTo(MobileProFive o) {
		Double a = this.cost;
		Double b = o.cost;
		return a.compareTo(b);
	}
}
