package com.covalense.javaapp.assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/*
 * 5)WAP to count the type of objects present in the ArrayList.
 */
public class CountObjectTest {
	private static final Logger LOGGER = Logger.getLogger("Test");

	public static void main(String[] args) {

		List<Animal> list = new ArrayList<Animal>();
		list.add(new Dog());
		list.add(new Cat());
		list.add(new Dog());
		list.add(new Cat());
		list.add(new Dog());

		int dogCount = 0;
		int catCount = 0;

		for (Animal animal : list) {
			if (animal instanceof Dog) {
				dogCount++;
			} else if (animal instanceof Cat) {
				catCount++;
			}
		}

		LOGGER.info("dog count = " + dogCount + "  Cat count = " + catCount);

	}
}//end of class
