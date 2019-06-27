package com.covalense.javaapp.collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;


public class HasSetGenerictype {
	public static void main(String[] args) {
		// generic HasSet implementation
		
				HashSet<String> h=new HashSet<String>();
				h.add("amal");
				h.add("ramesh");
				h.add("jl");
				
				for(Object r : h)
				{
					System.out.println(r);
				}
				//using iterator 
				System.out.println("\nusing iterator");
				Iterator<String> i=h.iterator();
				while(i.hasNext())
				{
					Object r=i.next();
					System.out.println(r);
				}
				
				
	}

}
