package com.covalense.javaapp.javabean;

public class TestA {

	public static void main(String[] args) {

		Person p=new Person();
		Db1 s=new Db1();
		Db2 c=new Db2();
		p.setAge(80);
		p.setName("amal");
		s.recieve(p);
		c.recieve(p);
		
	}

}
