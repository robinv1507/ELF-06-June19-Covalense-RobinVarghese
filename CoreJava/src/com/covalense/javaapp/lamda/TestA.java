package com.covalense.javaapp.lamda;

public class TestA {

	public static void main(String[] args) {

		Sum s=(a,b)->a+b;
		int i=s.add(2,2);
		System.out.println(i);
	}

}
