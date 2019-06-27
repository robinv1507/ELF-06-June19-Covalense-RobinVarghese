package com.covalense.javaapp.assignmentthree;

import lombok.extern.java.Log;

@Log

public class TestStudent {

	public static void main(String[] args) {

		// creating student class type array
		Student a[] = new Student[4];

		// creating 4 object of student class
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();

		s1.setName("robin");
		s1.setAge(20);
		s1.setId(1);

		// passing the value to second student object
		s2.setName("Amal");
		s2.setAge(20);
		s2.setId(2);
		// passing the value to 3 student object
		s3.setName("nilesh");
		s3.setAge(20);
		s3.setId(3);
		// passing the value to 4 student object
		s4.setName("kalbesh");
		s4.setAge(26);
		s4.setId(4);

		a[0] = s1;
		a[1] = s2;
		a[2] = s3;
		a[3] = s4;

		for (int i = 0; i < a.length; i++) {

			log.info("" + "name is " + a[i].getName());
			log.info("" + "Age is " + a[i].getAge());
			log.info("" + "Id is " + a[i].getId());
			log.info("" + "***************");

		} // end for loop

	}// end main
}// end class