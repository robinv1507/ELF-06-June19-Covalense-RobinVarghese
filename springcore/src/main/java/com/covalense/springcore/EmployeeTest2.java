package com.covalense.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.EmployeeBean;
import lombok.extern.java.Log;

@Log
/*
 * Spring core -simple demo
 * reading the data at run time 
 */
public class EmployeeTest2 {
	public static void main(String[] args) {
		// instantiate the object
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("employeeBeans.xml");
		EmployeeBean employeeBean1 = (EmployeeBean) applicationContext.getBean("employee");

		Scanner scanner = new Scanner(System.in);
		// reading the data at run time
		log.info("enter the name :");
		employeeBean1.setName(scanner.nextLine());
	
		log.info("enter the id :");
		employeeBean1.setId(scanner.nextInt());

		EmployeeBean employeeBean2 = (EmployeeBean) applicationContext.getBean("employee");
		scanner.nextLine();
		// reading the data at run time
		log.info("enter the name :");
		employeeBean2.setName(scanner.nextLine());
	
		log.info("enter the id :");
		employeeBean2.setId(scanner.nextInt());
		
		// displaying data
		log.info(employeeBean1.toString());

		log.info(employeeBean2.toString());
		
		scanner.close();
		((AbstractApplicationContext)applicationContext).close();
	}// end of main

}// end of class
