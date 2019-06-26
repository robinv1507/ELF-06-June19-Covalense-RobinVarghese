package com.covalense.javaapp.immutableclass;

public class Person {
	final private int age;
	final private String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	
	
	

}
