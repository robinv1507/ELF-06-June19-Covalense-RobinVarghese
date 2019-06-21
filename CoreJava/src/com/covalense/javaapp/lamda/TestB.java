package com.covalense.javaapp.lamda;

public class TestB {
	public static void main(String[] args) {
		
	Factorial f=a->{
		int k=1;
		for(int i=1;i<=a;i++)
		{
			k=k*i;
		}
		return k;
	};//lamda1 expression closed
	
	int fact=f.fact(2);
	System.out.println(fact);
	
	
	}

}
