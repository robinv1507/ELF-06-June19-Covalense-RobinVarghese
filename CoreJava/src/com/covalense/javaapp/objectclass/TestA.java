package com.covalense.javaapp.objectclass;
public class TestA {

	public static void main(String[] args) {

		Student s1=new Student("nilesh",20);
		Student s2=new Student("nilesh",2);
	
		
		System.out.println(s1.equals(s2) );
		System.out.println(s1);//will print s1 class members with the help of toSting()
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());//will show s2 object integer address

		
		
	}

}
