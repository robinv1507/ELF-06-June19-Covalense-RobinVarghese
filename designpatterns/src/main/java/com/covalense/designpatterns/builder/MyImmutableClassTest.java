package com.covalense.designpatterns.builder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.extern.java.Log;

@Log
/*
 * design pattern - builder immutable class demo
 */
public class MyImmutableClassTest {

	public static void main(String[] args) throws ParseException {

		MYImmutableClass immutableClass=null;
		immutableClass= new MYImmutableClass("ciyaz", 20, 75598769070l);

		log.info("Name :" + immutableClass.getName());
		log.info("Age :" + immutableClass.getAge());

		 immutableClass = new MYImmutableClass("riyaz", 20, 75598769070l);

		log.info("Name :" + immutableClass.getName());
		log.info("Age :" + immutableClass.getAge());
		
		SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
		Date date=format.parse("1981-02-02");
		
		EmployeeData data=new EmployeeData(01, "pranav", "male", 520000, 9878978978l, "prv@gmail.com","software engineer",date, 54545445,date, 10, 120, 25);
		log.info("Empployee data :"+data.toString());
			
		EmployeeData2 data2=new EmployeeData2.EmployeeData2Builder()
				                 .id(123)
				                 .name("pranav")
				                 .gender("male")
				                 .salary(122000)
				                 .phone(6899689889L)
				                 .email("prv@gmail.com")
				                 .designation("software engineer")
				                 .dob(date)
				                 .accountNumber(5465644)
				                 .joiningDate(date)
				                 .departmentId(10)
				                 .managerId(120)
				                 .age(23)
				                 .build();
		
		log.info("Empployee data :"+data2.toString());
		
		//using builder 
		EmployeeData3 data3=new EmployeeData3.EmployeeData3Builder()
                .id(123)
                .name("pranav")
                .gender("male")
                .salary(122000)
                .phone(6899689889L)
                .email("prv@gmail.com")
                .designation("software engineer")
                .dob(date)
                .accountNumber(5465644)
                .joiningDate(date)
                .departmentId(10)
                .managerId(120)
                .age(23)
                .build();

          log.info("Empployee data :"+data3.toString());
		

	}// end of main

}// end of class
