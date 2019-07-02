package com.covalense.javaapp.assignmenteight;

import java.util.ArrayList;

import lombok.extern.java.Log;

/*
 * progarm to find  employee  with the lowest salary
 */
@Log
public class EmployeeLowestSalaryMain {

	public static void main(String[] args) {

		
		
		Employee employee1 = new Employee("robin", 220000, 01);

		Employee employee2 = new Employee("nilesh", 100000, 05);

		Employee employee3 = new Employee("bibin", 250000, 06);

		Employee employee4 = new Employee("kalbesh", 20000, 04);

		ArrayList<Employee> employeeArrayList = new ArrayList<>();
		employeeArrayList.add(employee1);
		employeeArrayList.add(employee2);
		employeeArrayList.add(employee3);
		employeeArrayList.add(employee4);
        
		//calling the getHighSalary()
		Employee employeeLowestSalary  = Employee.getLowestSalary (employeeArrayList);

		// printing the Highest salary earning employee

		log.info(" Lowest salary earning employee is "+employeeLowestSalary .name
				     +"\n salary is "+ employeeLowestSalary.salary);

	}// main end

}// class end
