package com.covalense.hibernateapp.onetoone;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import lombok.Data;

@Data
@SuppressWarnings("serial")
@Entity
@Table(name="employee_info")

public class EmployeeInfoBean implements Serializable {

	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private EmployeeOtherInfoBean otherInfo;
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
	
	
	
	
	

}//end of class
