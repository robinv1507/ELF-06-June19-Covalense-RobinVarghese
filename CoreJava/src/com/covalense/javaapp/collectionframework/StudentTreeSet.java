package com.covalense.javaapp.collectionframework;

import java.util.TreeSet;

public class StudentTreeSet {
	/*
	 * 
	 */

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "robin";
		s1.id = 9;
		s1.percentage = 99.0;

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

		TreeSet<Student> h = new TreeSet<Student>();
		h.add(s1);
		h.add(s2);
		h.add(s3);
		h.add(s4);

		// by default treeSet will be ascending sort will be happen

		for (Student s : h) {

			System.out.println("Name is " + s.name);
			System.out.println("Id is " + s.id);
			System.out.println("Percentage is " + s.percentage);
			System.out.println("*******");

		}
	}

}
