package com.covalense.javaapp.javabean;

import com.javaBean.Person;

public class Db1 {

	void recieve(Person p) {
		System.out.println("****DB1**********");
		System.out.println("Name is " + p.getName());
		System.out.println("Age is " + p.getAge());
		
	}
}
