package com.covalense.javaapp.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMap1 {

	public static void main(String[] args) {
		
		
		
LinkedHashMap<String,Integer> hm=new LinkedHashMap<String,Integer>();
		
		hm.put("one",1 );
		hm.put("two",2 );
		hm.put("three",3 );
		hm.put("four",4 );
		
		for(Map.Entry<String,Integer> e : hm.entrySet())
		{
			String key=e.getKey();
			Integer value=e.getValue();
			System.out.println("key is -> "+key);
			System.out.println("value is ->"+value);
			System.out.println("****");
			
		}
	}
}
