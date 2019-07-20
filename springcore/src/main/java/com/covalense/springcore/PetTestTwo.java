package com.covalense.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.Pet;

import lombok.extern.java.Log;
@Log
/*
 *  Auto wiring using both Anotation and xml config file
 */
public class PetTestTwo {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("petConfig.xml");

		Pet pet = (Pet) context.getBean("pet");

		log.info(pet.getName());
		// or
		// pet.doSomthing();

	}// end of main

}// end of class
