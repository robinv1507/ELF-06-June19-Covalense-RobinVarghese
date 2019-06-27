package com.covalense.javaapp.javabean;

public class TestA {

	public static void main(String[] args) {

		Person p=new Person();
		DbOne s=new DbOne();
		DbTwo c=new DbTwo();
		p.setAge(80);
		p.setName("amal");
		s.recieve(p);
		c.recieve(p);
		
	}

}
