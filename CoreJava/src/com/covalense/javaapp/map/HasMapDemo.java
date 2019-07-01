package com.covalense.javaapp.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import lombok.extern.java.Log;

@Log
/*
 * HashMap demo program
 */
public class HasMapDemo {
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
			log.info("key is -> " + key);
			log.info("value is ->" + value);
			log.info("****");

		}

		// taking only hashMap key
		log.info("\nKey :");
		Set<String> ts = hm.keySet();
		for (String s : ts) {
			log.info("key=>" + s);
		}

		// taking only hashMap values

		log.info("\n values :");
		Collection<Integer> c = hm.values();
		for (Integer i : c) {
			log.info("Value=>" + i);

		} // for each loop end
	}// main end
}// class end
