package com.covalense.javaapp.collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetNonGeneric {
	
	public static void main(String[] args) {
		//non generic HasSet implementation
		
		HashSet h=new HashSet();
		h.add(2);
		h.add(2.0);
		h.add("jl");
		
		for(Object r : h)
		{
			System.out.println(r);
		}
		//using iterator 
		System.out.println("\nusing iterator");
		Iterator i=h.iterator();
		while(i.hasNext())
		{
			Object r=i.next();
			System.out.println(r);
		}
		
		
	}

}
