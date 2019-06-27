package com.covalense.javaapp.methodoverloading;
/*
 * passing the object to the method 
 */
public class TestB {

	public static void main(String[] args) {

		Iphone p = new Iphone();

		Girl g = new Girl();
		g.recieve(p);

	}//end of main

}//end of class
