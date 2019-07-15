package com.covalense.javaapp.assessment;

public class Student {
	int roleNumber;
	String name;
	double percentage;
	String gender;

	public Student(int roleNumber, String name, Double percentage,String gender) {
		this.roleNumber = roleNumber;
		this.name = name;
		this.percentage = percentage;
		this.gender=gender;
	}


	public int getRoleNumber() {
		return roleNumber;
	}



	public String getName() {
		return name;
	}



	public double getPercentage() {
		return percentage;
	}



	public String getGender() {
		return gender;
	}



	@Override
	public String toString() {
		return "Student [roleNumber=" + roleNumber + ", name=" + name + ", percentage=" + percentage + " gender="+gender+"]";
	}
	
}
