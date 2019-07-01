package com.covalense.javaapp.lamdaimplementation;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
/*
 * finding the topper of student
 */
public class TestStudentTopper {

	// comparator 
	static Comparator<Student> c = (i, j) -> {
		if (i.marks > j.marks) {
			return 1;
		} else if (i.marks < j.marks) {
			return -1;

		} else {
			return 0;
		}
	};
	// gettopper method
	static Student getTopper(ArrayList<Student> al) {
		return al.stream().max(c).get();
	}
	
	public static void main(String[] args) {

		Student s1 = new Student("nilesh", 21, 79.8);
		Student s2 = new Student("pibil", 22, 80);
		Student s3 = new Student("sibil", 21, 83);
		// sorting the Products by name

		ArrayList<Student> a = new ArrayList<>();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		// printing the topper
		Student t = getTopper(a);
		log.info("topper is " + t.name);

	}// end of main
}// end of class
