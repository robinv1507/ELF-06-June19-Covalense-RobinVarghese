package com.covalense.javaapp.array;

public class TestD {

	public static void main(String[] args) {

		int a[]= {10,20,30};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("**Reverse of the above array ***");
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		char b[]= {'d','i','v','y','a'};
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
		}
	}

}
