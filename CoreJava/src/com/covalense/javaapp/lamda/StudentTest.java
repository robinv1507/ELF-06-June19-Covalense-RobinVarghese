package com.covalense.javaapp.lamda;
import java.util.function.Consumer;

import lombok.extern.java.Log;

@Log
/*
 * Lambda- Consumer functional interface demo
 * passing the student object and calculating average,
 * mark of student.
 */
public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("robin", 22, 11, 22);

		Consumer<Student> c = s -> {
			double avg = (s.m1 + s.m2 + s.m3) / 3.0;
			log.info(s.name + " average score =" + avg);

		};
		c.accept(s1);//passing the s1 object to consumer

	}// main end

}// class end
