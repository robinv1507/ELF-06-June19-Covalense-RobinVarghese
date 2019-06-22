package com.covalense.javaapp.immutableclass;

public class TestB {

	public static void main(String[] args) {

		Employee e=new Employee("robin", 129, 23, 'm',true );
		
		System.out.println("name :"+e.getName());
		System.out.println("Age :"+e.getAge());
		System.out.println("gender :"+e.getGender());
		
		System.out.println("status :"+e.isStatus());
	}

}
