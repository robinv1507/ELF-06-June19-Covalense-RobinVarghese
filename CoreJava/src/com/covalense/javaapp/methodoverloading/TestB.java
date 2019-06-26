package com.covalense.javaapp.methodoverloading;

public class TestB {

	public static void main(String[] args) {

		Iphone p = new Iphone();

		Girl g = new Girl();
		g.recieve(p);

	}

}
