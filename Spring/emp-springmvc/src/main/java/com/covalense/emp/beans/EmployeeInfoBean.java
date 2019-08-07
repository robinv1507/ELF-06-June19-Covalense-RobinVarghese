package com.covalense.emp.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Data;

@Data
@SuppressWarnings("serial")
@Entity
@Table(name = "employee_info")

public class EmployeeInfoBean implements Serializable {
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy="infoBean")
	private EmployeeOtherInfoBean otherInfo;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="addPK.infoBean")
	private List<EmployeeAddressInfoBean> addressInfoBean;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="educationalInfoPKBean.infoBean")
	private List<EmployeeEducationalInfoBean>  educationalInfoBeans;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="empPkBean.infoBean")
	private List<EmployeeExperienceInfoBean>  expInfoBean;
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="infoBeans")
	private List<TrainingInfoBean> trainingInfoBeans ;

	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "SALARY")
	private double salary;
	@Column(name = "PHONE")
	private long phone;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "DESIGNATION")
	private String designation;
	@Column(name = "DOB")
	private Date dob;
	@Column(name = "ACCOUNT_NO")
	private long accountNumber;
	@Column(name = "JOINING_DATE")
	private Date joiningDate;
	
	@ManyToOne//(cascade=CascadeType.ALL)
	@JoinColumn(name = "DEPPT_ID",referencedColumnName="DEPT_ID")
	private DepartmentInfoBean departmentInfoBean;

	//many to one relation for manager-id 
	@ManyToOne
	@JoinColumn(name="MANAGER_ID",referencedColumnName="id")
	private EmployeeInfoBean managerId;
	
	@Column(name = "AGE")
	private int age;
	@Column(name = "password")
	private String password;

}// end of class
