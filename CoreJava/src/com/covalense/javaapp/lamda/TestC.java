package com.covalense.javaapp.lamda;

public class TestC {
	public static void main(String[] args) {
		/*
		 * lamda0 expression for lenght0 of a string
		 * 
		 */
		LenghtOfString s = a -> a.length();

		int i = s.stringLenght("robin");

		System.out.println(i);
	}

}
