package com.covalense.javaapp.collectionframework;

import java.util.TreeSet;
/*
 * object type generic treeSet  demo program
 */

public class EmployeeMain {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "Ramesh";
		e1.id = 07;
		e1.salary = 50000;

		Employee e2 = new Employee();
		e2.name = "nilesh";
		e2.id = 03;
		e2.salary = 70000;

		Employee e3 = new Employee();
		e3.name = "kalpesh";
		e3.id = 04;
		e3.salary = 30000;

		EmployeeByName ename = new EmployeeByName();

		/*
		 * TreeSet sorting by employee salary passing by ,
		 *  employeeBySalary object to TreeSet
		 */
		TreeSet<Employee> h = new TreeSet<Employee>(ename);
		h.add(e1);
		h.add(e2);
		h.add(e3);

		for (Employee p : h) {

			System.out.println("Name is " + p.name);
			System.out.println("id is " + p.id);
			System.out.println(" salary is " + p.salary);

			System.out.println("*******");

		} // for loop end

	}// main end
}// class end
