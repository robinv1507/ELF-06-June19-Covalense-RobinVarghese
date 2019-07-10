package com.covalense.hibernateapp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name="employee_info")

public class EmployeeInfoBean implements Serializable {
	
	
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="GENDER")
	private String gender;
	@Column(name="SALARY")
	private double salary;
	@Column(name="PHONE")
	private long phone;
	@Column(name="EMAIL")
	private String email;
	@Column(name="DESIGNATION")
	private String designation;
	@Column(name="DOB")
	private Date dob;
	
	@Column(name="ACCOUNT_NO")
	private long acntNo;
	
	@Column(name="JOINING_DATE")
	private Date joiningDate;
	@Column(name="DEPPT_ID")
	private int deptId;
	@Column(name="MANAGER_ID")
	private int managerId;
	@Column(name="AGE")
	private int age;
	
	
	//setters and getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public long getAcntNo() {
		return acntNo;
	}
	public void setAcntNo(long acntNo) {
		this.acntNo = acntNo;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	
	
	
	
	
	

}//end of class
