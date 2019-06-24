package com.covalense.javaapp.map;

import java.util.Map;
import java.util.TreeMap;


public class TreeMapA {

	public static void main(String[] args) {

		TreeMap<String,Integer> tm=new TreeMap<String,Integer>();

		tm.put("one", 1);
		tm.put("two", 2);
		tm.put("three", 3);
		tm.put("four", 4);

		for (Map.Entry<String, Integer> e : tm.entrySet()) {
			String key = e.getKey();
			Integer value = e.getValue();
			System.out.println("key is -> " + key);
			System.out.println("value is ->" + value);
			System.out.println("****");

		}
	}

}
