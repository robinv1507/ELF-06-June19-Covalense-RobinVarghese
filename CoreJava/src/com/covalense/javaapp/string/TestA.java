package com.covalense.javaapp.string;

import lombok.extern.java.Log;

@Log
/*
 * string length() demo
 */
public class TestA {

	public static void main(String[] args) {

		String name="dimple";
		int size=name.length();//length() return number of characters in string
		log.info(name+"size ="+size);
		
		
		
	}//main end

}//class end
