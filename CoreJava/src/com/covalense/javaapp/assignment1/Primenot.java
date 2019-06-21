package com.covalense.javaapp.assignment1;

public class Primenot {

	public static void main(String[] args) {

		int a=9;
		byte count=0;

		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				++count;
				break;
			}
		}
		if(count==0)
		{
			System.out.println(a+"\tis a prime number");
		}
		else
		{
			System.out.println(a+"\tis a not prime number");
		}

	}

}
