package com.covalense.javaapp.assessment;

/*1)WAP to print sound of an animal based on the object received by the method.*/

public class AnimalSoundTest {

	public static void main(String[] args) {
	
		Animal c = new Cat();
		Animal d = new Dog();
		AnimalSound s = new AnimalSound();
		
		// passing object of Cat class
		s.getSound(c);
		// passing object of Dog class
		s.getSound(d);

	}//end of the main

}//end of class
