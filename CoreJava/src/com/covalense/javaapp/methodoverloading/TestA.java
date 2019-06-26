package com.covalense.javaapp.methodoverloading;

 class Animal {

	void eat()
	{
		System.out.println("eat food");
	}
}

class Cow extends Animal {

	void eat()
	{
		System.out.println("eat grass");
	}

}

 class Lion extends Animal {


	void eat()
	{
		System.out.println("eat meat");
	}
	
}
public class TestA {
static	Animal a;

	public static void main(String[] args) {

	
		a.eat();

	}

}
