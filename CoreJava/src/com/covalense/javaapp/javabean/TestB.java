package com.covalense.javaapp.javabean;

public class TestB {

	public static void main(String[] args) {

		Employee e=new Employee();
		
		DbThree q=new DbThree();
		DbFour v=new DbFour();
		
		e.setName("ram");
		e.setAge(12);
		e.setGender("male");
		e.setSalary(1500);
		
		q.recieve(e);
		
		v.recieve(e);
	}

}
