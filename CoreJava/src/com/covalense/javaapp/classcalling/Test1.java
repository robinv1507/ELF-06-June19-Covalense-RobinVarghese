package com.covalense.javaapp.classcalling;

class Phone {
	double price;
	String name;

	void ads() {
		System.out.println(" welcome to *S S communications*");
	}
}

public class Test1 {

	public static void main(String[] args) {

		Phone p1 = new Phone();
		p1.price = 15000;
		p1.name = "redmi note 7 pro";

		p1.ads();

		System.out.println("name is " + p1.name);
		System.out.println("Price  is " + p1.price);

	}

}
