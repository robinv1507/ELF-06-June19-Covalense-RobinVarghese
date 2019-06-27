package com.covalense.javaapp.lamdaimplementation;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;
@Log
/*
 * sorting the employee object by name,
 * using lambda with comparator
 */
public class TestEmployee {
	public static void main(String[] args) {

		Employee e1 = new Employee("ram", 2000, 1);
		Employee e2 = new Employee("faruk", 2000, 2);
		
		Comparator<Employee> c2 = (e, f) -> e.name.compareTo(f.name);

		TreeSet<Employee> ts = new TreeSet<Employee>(c2);
		ts.add(e1);
		ts.add(e2);

		for (Employee p : ts) {

			log.info("Name is " + p.name);
			log.info("id " + p.id);

			log.info("*******");

		}//for end

	}//main end

}//class end
