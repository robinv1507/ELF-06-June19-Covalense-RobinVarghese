package com.covalense.javaapp.immutableclass;

public class Employee {
	final private String name;
	private final  double height;
	private final int age;
	private final char gender;
	private final boolean status;
	public Employee(String name, double height, int age, char gender, boolean status) {
		super();
		this.name = name;
		this.height = height;
		this.age = age;
		this.gender = gender;
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public boolean isStatus() {
		return status;
	}
	
	
	

}
