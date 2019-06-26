package com.covalense.javaapp.javabean;

public class TestB {

	public static void main(String[] args) {

		Employee e=new Employee();
		
		Db3 q=new Db3();
		Db4 v=new Db4();
		
		e.setName("ram");
		e.setAge(12);
		e.setGender("male");
		e.setSalary(1500);
		
		q.recieve(e);
		
		v.recieve(e);
	}

}
