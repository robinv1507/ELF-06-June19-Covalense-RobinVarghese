package com.covalense.javaapp.map;

import java.util.Map;
import java.util.TreeMap;

import lombok.extern.java.Log;

@Log
/*
 * TreeMap demo program
 */
public class TreeMapA {

	public static void main(String[] args) {

		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();

		tm.put("one", 1);
		tm.put("two", 2);
		tm.put("three", 3);
		tm.put("four", 4);

		for (Map.Entry<String, Integer> e : tm.entrySet()) {
			String key = e.getKey();
			Integer value = e.getValue();
			log.info("key is -> " + key);
			log.info("value is ->" + value);
			log.info("****");

		} // for each loop end
	}// main end
}// class end
