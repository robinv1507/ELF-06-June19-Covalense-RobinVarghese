package com.covalense.designpatterns.builder;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
@Builder
@ToString
public final class EmployeeData3 {

	private int id;

	private String name;
	private String gender;
	private long salary;
	private long phone;
	private String email;
	private String designation;
	private Date dob;
	private long accountNumber;
	private Date joiningDate;
	private int departmentId;
	private int managerId;
	private int age;

}// end of class
