package com.covalense.javaapp.immutableclass;

import lombok.extern.java.Log;

@Log
public class TestA {

	public static void main(String[] args) {

		Person p=new Person(12,"ram");
		
		log.info("name is "+p.getName());
	}

}
