package com.covalense.javaapp.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HasMap1 {
	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("four", 4);
		// normal display is unordered

		for (Map.Entry<String, Integer> e : hm.entrySet()) {
			String key = e.getKey();
			Integer value = e.getValue();
			System.out.println("key is -> " + key);
			System.out.println("value is ->" + value);
			System.out.println("****");

		}

		// taking only hashMap key
		System.out.println("\nKey :");
		Set<String> ts = hm.keySet();
		for (String s : ts) {
			System.out.println("key=>" + s);
		}

		// taking only hashMap values

		System.out.println("\n values :");
		Collection<Integer> c = hm.values();
		for (Integer i : c) {
			System.out.println("Value=>" + i);

		}

	}

}
