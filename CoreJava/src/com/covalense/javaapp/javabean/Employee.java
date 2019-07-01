package com.covalense.javaapp.javabean;

public class Employee {

	private String name;
	private int salary;
	private int age;
	// parameterized constructor

	public Employee(String name, int salary, int age, String gender) {
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.gender = gender;
	}

	// default constructor
	public Employee() {

	}

	// getters and setters
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
