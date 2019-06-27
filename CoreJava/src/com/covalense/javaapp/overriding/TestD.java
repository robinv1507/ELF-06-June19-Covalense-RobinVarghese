package com.covalense.javaapp.overriding;

import lombok.extern.java.Log;

@Log
/*
 * method overriding demo
 */
class AnimalA {

	void eat() {
		log.info("eat food");
	}
}//class animal end

@Log
class CowA extends AnimalA {
	@Override
	void eat() {
		log.info("eat grass");
	}

}//class cow end

@Log
class LionA extends AnimalA {
	@Override
	void eat() {
		log.info("eat meat");
	}

}// lion class end

public class TestD {

	public static void main(String[] args) {
		AnimalA a = new LionA();
		a.eat();

	}// main end

}// class end
