package com.covalense.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.beans.DepartmentBean;
import com.covalense.springcore.beans.EmployeeBeanTwo;
import com.covalense.springcore.configurations.EmployeeConfig;

import lombok.extern.java.Log;
@Log
/*
 * Spring core -Auto wire using annotation
 */
public class AutoWireAnnotatedEmployeeTest {
	
	public static void main(String[] args) {
				//instantiate the object
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBeanTwo employeeBean1=applicationContext.getBean(EmployeeBeanTwo.class);
		
	   log.info(employeeBean1.toString());
	   //displaying dept 
	   DepartmentBean employeeBean2=employeeBean1.getDepartmentBean();
		
		   log.info(employeeBean2.toString());
		
	}//end of main

}//end of class
