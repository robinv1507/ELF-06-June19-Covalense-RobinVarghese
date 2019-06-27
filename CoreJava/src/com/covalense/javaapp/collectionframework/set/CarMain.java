package com.covalense.javaapp.collectionframework.set;

import java.util.TreeSet;

public class CarMain {

	public static void main(String[] args) {

		Car c1=new Car();
		c1.name="Bmw";
		c1.cost=2440000;
		c1.rating=4.4;
		c1.brand="a3";
		
		Car c2=new Car();
		c2.name="i20";
		c2.cost=600000;
		c2.rating=4.4;
		c2.brand="toyoto";
		
		Car c3=new Car();
		c3.name="Etios";
		c3.cost=6030000;
		c3.rating=2.4;
		c3.brand="toyoto";

		TreeSet<Car> h = new TreeSet<Car>();
		h.add(c1);
		h.add(c2);
		h.add(c3);
	

		for (Car p : h) {

			System.out.println("Name is " + p.name);
			System.out.println("cost is " + p.cost);
			System.out.println(" Rating is " + p.rating);
			System.out.println(" Brand is " + p.brand);
			
			System.out.println("*******");

		}
		
		
		
		
		
		
		
	}

}
