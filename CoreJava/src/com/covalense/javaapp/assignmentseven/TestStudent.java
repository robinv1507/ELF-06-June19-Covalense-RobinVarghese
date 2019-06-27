package com.covalense.javaapp.assignmentseven;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;
@Log
/*
 * sorting the student object by name,
 * using lambda with comparator
 */
public class TestStudent {
	public static void main(String[] args) {

		Student s1 = new Student("ram", 21,80);
		Student s2 = new Student("faruk", 20, 62);
		Student s3 = new Student("nilesh", 22, 77);
		//sorting the students by name 
		Comparator<Student> c2 = (e, f) -> e.name.compareTo(f.name);

		TreeSet<Student> ts = new TreeSet<>(c2);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
       //printing the sorted data
		for (Student p : ts) {

			log.info("Name is " + p.name);
			log.info("age is " + p.age);
			log.info("Mark is " + p.marks);
			log.info("*******");

		}//for end

	}//main end

}//class end
