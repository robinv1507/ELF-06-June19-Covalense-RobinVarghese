package com.covalense.javaapp.lamdaimplementation;

import java.util.Comparator;
import java.util.TreeSet;



public class TestEmployee {
	public static void main(String[] args) {
	
		
		Employee e1=new Employee("ram",2000,1);
		Employee e2=new Employee("faruk",2000,2);
		@SuppressWarnings("unused")
		Comparator<Employee> c=(e,f)->{
			
			if (e.id > e.id) {
				return 1;
			} else if (e.id < e.id) {
				return -1;
			} else {
				return 0;
			}
		};
		
		Comparator<Employee> c2=(e,f)->e.name.compareTo(f.name);
		
		TreeSet<Employee> ts=new TreeSet<Employee>(c2);
		ts.add(e1);
		ts.add(e2);
		

		for (Employee p : ts) {

			System.out.println("Name is " + p.name);
			System.out.println("id " + p.id);
			
			
			System.out.println("*******");

		}
		
		
		}

}
