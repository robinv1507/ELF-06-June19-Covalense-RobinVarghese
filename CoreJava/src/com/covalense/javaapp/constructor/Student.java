package com.covalense.javaapp.constructor;

public class Student {
	int age;
	String name;
	double percentage;
	
	Student(String n,int a,double p)
	{
		name=n;
		age=a;
		percentage=p;
		
	}
	void display()
	{
		System.out.println("name is :"+name);
		System.out.println("age is :"+age);
		System.out.println("percentage is :"+percentage);
	}

}
