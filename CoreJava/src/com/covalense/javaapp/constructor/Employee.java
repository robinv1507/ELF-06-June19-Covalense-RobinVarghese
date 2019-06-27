package com.covalense.javaapp.constructor;

public class Employee {

	String name;
	int id;
	double salary;
	
	Employee(String name,int id,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}
	void display()
	{
		System.out.println("name is :"+name);
		System.out.println("id is :"+id);
		System.out.println("Salary is :"+salary);
	}
}
