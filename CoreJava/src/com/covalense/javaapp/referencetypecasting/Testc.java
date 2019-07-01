package com.covalense.javaapp.referencetypecasting;

public class Testc {

	public static void main(String[] args) {

		Chips c=new Lays();//Up casting
		Lays l=(Lays)c;//down casting
		l.open();//lays parent method calling
		l.eat();
		
		Chips c1=new Bingo();//Up casting
		Bingo b=(Bingo)c1;//down casting
		b.open();//parent method
		b.byteBingo();
		
		
	}

}
