package com.covalense.javaapp.assignmentfifth;

import java.util.logging.Logger;

public class Student {
	private static final Logger log = Logger.getLogger("mylog");

	String name;
	int age;
	double marks;

	void set(String name, int age, double marks) {
		this.name = name;
		this.age = age;
		this.marks = marks;

	}

	void get() {
		log.info("" + name);
		log.info("" + age);
		log.info("" + marks);
	}

}
