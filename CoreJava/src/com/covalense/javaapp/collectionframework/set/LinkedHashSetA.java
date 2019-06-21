package com.covalense.javaapp.collectionframework.set;
import java.util.*;

public class LinkedHashSetA {
	public static void main(String[] args) {
		// non generic linkedHasSet implementation
	
		LinkedHashSet h=new LinkedHashSet();
		h.add("amal");
		h.add("ramesh");
		h.add("jl");
		
		for(Object r : h)
		{
			System.out.println(r);
		}
		//using iterator 
		System.out.println("\nusing iterator\n");
		Iterator<String> i=h.iterator();
		while(i.hasNext())
		{
			Object r=i.next();
			System.out.println(r);
		}
		
		
		
		
		
		
		
	}

}
