package com.covalense.springcore;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.EmployeeBean;
import lombok.extern.java.Log;
@Log
/*
 * Spring core -simple demo
 */
public class EmployeeTest {
	public static void main(String[] args) {
				//instantiate the object
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		EmployeeBean employeeBean1=(EmployeeBean) applicationContext.getBean("employeeBean1");
		
	   log.info(employeeBean1.toString());
		EmployeeBean employeeBean2=(EmployeeBean) applicationContext.getBean("employeeBean2");
		
		   log.info(employeeBean2.toString());
		
	}//end of main

}//end of class
