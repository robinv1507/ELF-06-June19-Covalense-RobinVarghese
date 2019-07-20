package com.covalense.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.covalense.springcore.interfaces.Animal;

public class Pet {
	
	String name;
	@Autowired
	//@Qualifier("monkey")
	private Animal animal;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public void doSomthing() {
		animal.eat();
		animal.makeSound();
	}
	

}
