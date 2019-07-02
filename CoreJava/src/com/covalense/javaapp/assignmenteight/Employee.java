package com.covalense.javaapp.assignmenteight;

import java.util.ArrayList;
import java.util.Comparator;

public class Employee {
	String name;

	double salary;
	int id;
	public Employee(String name, double salary, int id) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
		
	
	
	}//end of constructor	
	
	// comparator for finding high salary 
		static Comparator<Employee> c = (i, j) -> {
			if (i.salary > j.salary) {
				return 1;
			} else if (i.salary < j.salary) {
				return -1;

			} else {
				return 0;
			}
		};
		// getHighSalary method
		static Employee getHighSalary(ArrayList<Employee> al) {
			return al.stream().max(c).get();
		}
		// getLowestSalary method
				static Employee getLowestSalary(ArrayList<Employee> al) {
					return al.stream().min(c).get();
				}
	
	
	
}//end of class
