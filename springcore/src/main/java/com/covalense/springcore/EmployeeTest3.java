package com.covalense.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.covalense.springcore.beans.EmployeeBean;
import lombok.extern.java.Log;

@Log
/*
 * Spring core -wiring concept
 * auto wire & manual wire
 * 
 */
public class EmployeeTest3 {
	public static void main(String[] args) {
		// instantiate the object
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("employeeBeans.xml");
		EmployeeBean employeeBean1 = (EmployeeBean) applicationContext.getBean("employee");

		log.info(employeeBean1.toString());
		log.info(employeeBean1.getDepartmentBean().toString());
		
	}// end of main

}// end of class
