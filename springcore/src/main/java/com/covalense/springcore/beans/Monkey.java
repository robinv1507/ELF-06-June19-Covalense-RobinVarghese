package com.covalense.springcore.beans;

import com.covalense.springcore.interfaces.Animal;

import lombok.extern.java.Log;
@Log
public class Monkey implements Animal {

	@Override
	public void eat() {
    log.info("banana..");
	}

	@Override
	public void makeSound() {
		 log.info("shu hhuuu ..");
	}

}
