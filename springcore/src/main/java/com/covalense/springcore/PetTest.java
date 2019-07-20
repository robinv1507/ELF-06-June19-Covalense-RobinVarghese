package com.covalense.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.beans.Pet;
import com.covalense.springcore.configurations.PetConfig;

/*
 * Auto wire using interface
 */
public class PetTest {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(PetConfig.class);

		Pet pet = context.getBean(Pet.class);

		pet.getAnimal().eat();
		// or
		// pet.doSomthing();

	}// end of main

}// end of class
