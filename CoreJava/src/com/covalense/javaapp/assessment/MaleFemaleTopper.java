package com.covalense.javaapp.assessment;

import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
/*
 * 6)WAP to find the female and male
 *  topper of the class. (Using Lambda and Stream)
 */
public class MaleFemaleTopper {
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add( new Student(2, "John", 30.00,"male"));
		list.add( new Student(9, "Abhay", 75.50,"male"));
		list.add(  new Student(1, "Ria", 60.00,"female"));
		list.add(new Student(7, "lina", 87.00,"female"));
		

		log.info(list.stream().filter(student -> student.getGender().
				equalsIgnoreCase("female"))
				.mapToDouble(s -> s.getPercentage())
				.max().toString());

		log.info(list.stream().filter(student -> student.getGender()
				.equalsIgnoreCase("male"))
				.mapToDouble(s -> s.getPercentage())
				.max().toString());
		
		
	}//end of main

}//end of class
