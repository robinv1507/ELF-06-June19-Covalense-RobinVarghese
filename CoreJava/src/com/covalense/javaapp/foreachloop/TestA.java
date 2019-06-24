package com.covalense.javaapp.foreachloop;

import java.util.Arrays;

public class TestA {

	public static void main(String[] args) {

		Employee e1 = new Employee();// creating employee class object1

		e1.setId(1);
		e1.setName("ram");

		Employee e2 = new Employee();

		e2.setId(2);
		e2.setName("swetha");
		Employee e3 = new Employee();

		e3.setId(3);
		e3.setName("r");

		Employee e4 = new Employee();

		e4.setId(4);
		e4.setName("29");
		
		/*
		 * all the object created putting 
		 * to employee type array 
		 */

		Employee[] emp = { e1, e2, e3, e4 };
		
		Arrays.sort(emp);

		for (Employee e : emp) {
			System.out.println("name is " + e.getName());
			System.out.println("Id is " + e.getId());
			System.out.println("***********");

		}

	}

}
