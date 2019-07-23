package com.covalense.springcoreassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcoreassignment.bean.Dell;
import com.covalense.springcoreassignment.config.LaptopConfig;
import com.covalense.springcoreassignment.interfaces.Laptop;
/*
 * Spring Autowire demo program
 */

public class LaptopTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(LaptopConfig.class);
		Laptop dell = context.getBean(Dell.class);

		dell.showSpecificatiion();
	}//end of main

}//end of class
