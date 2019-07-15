package com.covalense.javaapp.assessment;

import java.util.ArrayList;
import lombok.extern.java.Log;

@Log
/*
 * 7)/	WAP to find the count of only passed,
 *  female candidates of the class. (Using Lambda and Stream)
 */
public class PassedFemaleCount {
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add( new Student(2, "John", 30.00,"male"));
		list.add( new Student(9, "Abhay", 75.50,"male"));
		list.add(  new Student(1, "Ria", 60.00,"female"));
		list.add(new Student(7, "lina", 87.00,"female"));
		
		log.info((String.valueOf(list.stream()
				.filter(student -> student.getGender()
				.equalsIgnoreCase("female") && student.getPercentage() > 30)
				.count())));
		
	}//end of main

}//end of class
