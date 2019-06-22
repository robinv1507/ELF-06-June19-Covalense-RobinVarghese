package com.as3;

import java.util.Scanner;

public class SringReverse {// class start
	private static void stringReverse(String s) {

		String rev = " ";
		int i, length;
		length = s.length();
		for (i = length - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		System.out.print("Reverse of Entered String is : " + rev);

	}

	public static void main(String[] args) {// main start

		Scanner c = new Scanner(System.in);
		System.out.println("enter the string");
		String s = c.nextLine();
		stringReverse(s);

		c.close();

	}// main end

}// class end
