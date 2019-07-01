package com.covalense.javaapp.map;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.extern.java.Log;

@Log
/*
 * LinkedHashMap demo program
 */
public class LinkedMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();

		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("four", 4);

		for (Map.Entry<String, Integer> e : hm.entrySet()) {
			String key = e.getKey();
			Integer value = e.getValue();
			log.info("key is -> " + key);
			log.info("value is ->" + value);
			log.info("****");

		}//for each loop end
	}//main end
}//class end
