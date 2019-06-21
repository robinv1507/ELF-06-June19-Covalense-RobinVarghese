package com.covalense.javaapp.abstraction;

public class Person implements Animal,Human {
	public void eat()
	{
		System.out.println("Animal eat method");
	}
	public void walk()
	{
		System.out.println("Human walk method");
	}

}
