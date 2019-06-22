package com.covalense.javaapp.referencetypecasting;

public class TestA {

	public static void main(String[] args) {

		Animal a=new Cow();//up casting
		Cow c=(Cow)a;//down casting
		
		c.i=1;
		c.eat();
		c.run();
		
		
	}

}
