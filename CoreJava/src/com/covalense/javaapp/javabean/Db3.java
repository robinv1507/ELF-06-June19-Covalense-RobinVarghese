package com.covalense.javaapp.javabean;

public class Db3 {

	void recieve(Employee e) {
		System.out.println("****DB3**********");
		System.out.println("Name is " + e.getName());
		System.out.println("Age is " + e.getAge());
		System.out.println("Gender is " + e.getGender() );
		System.out.println("Salary is " + e.getSalary());
	}
}
