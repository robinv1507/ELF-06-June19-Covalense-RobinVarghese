package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ObjectArrayListIterator {
	public static void main(String[] args) {
		

		ArrayList<Student> a1 = new ArrayList<Student>();

		Student s1 = new Student();
		s1.name = "robin";
		s1.id = 01;
		s1.percentage = 66.0;

		Student s2 = new Student();
		s2.name = "nilesh";
		s2.id = 02;
		s2.percentage = 69.0;

		Student s3 = new Student();
		s3.name = "ramesh";
		s3.id = 04;
		s3.percentage = 78.0;

		Student s4 = new Student();
		s4.name = "kalpesh";
		s4.id = 05;
		s4.percentage = 79.0;

		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);

		Iterator<Student> it=a1.iterator();
		while(it.hasNext())
		{
			Student s=it.next();
		
			System.out.println("Name is " + s.name);
			System.out.println("Id is " + s.id);
			System.out.println("Percentage is " + s.percentage);
			System.out.println("*******");

		}
	}

}
