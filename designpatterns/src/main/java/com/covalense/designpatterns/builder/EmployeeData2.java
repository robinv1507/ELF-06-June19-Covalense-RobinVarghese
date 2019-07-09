package com.covalense.designpatterns.builder;

import java.util.Date;
import lombok.Getter;
import lombok.ToString;
@Getter
@ToString

public class EmployeeData2 {

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
	
	private EmployeeData2(EmployeeData2Builder builder) {
		
		id=builder.id;
		name=builder.name;
		gender=builder.gender;
		salary=builder.salary;
		phone=builder.phone;
		email=builder.email;
		designation=builder.designation;
		dob=builder.dob;
		accountNumber=builder.accountNumber;
		joiningDate=builder.joiningDate;
		departmentId=builder.departmentId;
		managerId=builder.managerId;
		age=builder.age;
		
	}
   public static class EmployeeData2Builder{ 
	   
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


	public EmployeeData2Builder id(int id) {

		this.id = id;
		return this;

	}

	public EmployeeData2Builder name(String name) {

		this.name = name;
		return this;

	}

	public EmployeeData2Builder gender(String gender) {

		this.gender=gender;
		return this;

	}

	public EmployeeData2Builder email(String email) {

		this.email=email;
		return this;

	}
	public EmployeeData2Builder salary(long salary) {

		this.salary = salary;
		return this;

	}

	public EmployeeData2Builder phone(long phone) {

		this.phone = phone;
		return this;

	}

	public EmployeeData2Builder designation(String designation) {

		this.designation = designation;
		return this;
	}
	public EmployeeData2Builder dob(Date dob) {

		this.dob = dob;
		return this;
	}

	public EmployeeData2Builder accountNumber(long accountNumber) {

		this.accountNumber = accountNumber;
		return this;
	}

	public EmployeeData2Builder joiningDate( Date joiningDate) {

		this.joiningDate = joiningDate;
		return this;
	}
	public EmployeeData2Builder managerId(int managerId) {

		this.managerId = managerId;
		return this;
	}
	public EmployeeData2Builder departmentId(int departmentId) {

		this.departmentId = departmentId;
		return this;
	}
	public EmployeeData2Builder age(int age) {

		this.age = age;
		return this;
	}

	
	public EmployeeData2 build() {
		return new EmployeeData2(this);
	}
	
   }//inner class end

}// end of class
