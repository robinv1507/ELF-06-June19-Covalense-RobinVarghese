package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(22);
		al.add(1);
		al.add("hero");
		al.add(4);
		
		for(int i=0;i<al.size();i++)
		{
			Object r=al.get(i);
			System.out.println(r);
		}
	}
}
