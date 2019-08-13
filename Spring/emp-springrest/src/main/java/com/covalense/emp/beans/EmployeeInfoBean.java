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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@XmlRootElement(name = "employee-info-bean")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="id")
@JsonRootName(value="employee-info-bean")
@SuppressWarnings("serial")
@Entity
@Table(name = "employee_info")

public class EmployeeInfoBean implements Serializable {
	@XmlElement(name = "other-info")
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "infoBean")
	private EmployeeOtherInfoBean otherInfo;

	@XmlElement(name = "address-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "addPK.infoBean")
	private List<EmployeeAddressInfoBean> addressInfoBean;

	@XmlElement(name = "educational-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "educationalInfoPKBean.infoBean")
	private List<EmployeeEducationalInfoBean> educationalInfoBeans;

	@XmlElement(name = "experience-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empPkBean.infoBean")
	private List<EmployeeExperienceInfoBean> expInfoBean;

	@XmlElement(name = "training-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "infoBeans")
	private List<TrainingInfoBean> trainingInfoBeans;

	@Id
	@Column(name = "ID")
	private Integer id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "SALARY")
	private Double salary;
	@Column(name = "PHONE")
	private Long phone;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "DESIGNATION")
	private String designation;
	@Column(name = "DOB")
	private Date dob;
	@Column(name = "ACCOUNT_NO")
	private Long accountNumber;
	@Column(name = "JOINING_DATE")
	private Date joiningDate;

	@XmlElement(name = "department-info")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DEPPT_ID", referencedColumnName = "DEPT_ID")
	private DepartmentInfoBean departmentInfoBean;

	// many to one relation for manager-id
	@XmlElement(name = "manager-id")
	@ManyToOne
	@JoinColumn(name = "MANAGER_ID", referencedColumnName = "id")
	private EmployeeInfoBean managerId;

	@Column(name = "AGE")
	private Integer age;
	@Column(name = "password")
	private String password;

	// getters and setters
	public EmployeeOtherInfoBean getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(EmployeeOtherInfoBean otherInfo) {
		this.otherInfo = otherInfo;
	}

	public List<EmployeeAddressInfoBean> getAddressInfoBean() {
		return addressInfoBean;
	}

	public void setAddressInfoBean(List<EmployeeAddressInfoBean> addressInfoBean) {
		this.addressInfoBean = addressInfoBean;
	}

	public List<EmployeeEducationalInfoBean> getEducationalInfoBeans() {
		return educationalInfoBeans;
	}

	public void setEducationalInfoBeans(List<EmployeeEducationalInfoBean> educationalInfoBeans) {
		this.educationalInfoBeans = educationalInfoBeans;
	}

	public List<EmployeeExperienceInfoBean> getExpInfoBean() {
		return expInfoBean;
	}

	public void setExpInfoBean(List<EmployeeExperienceInfoBean> expInfoBean) {
		this.expInfoBean = expInfoBean;
	}

	public List<TrainingInfoBean> getTrainingInfoBeans() {
		return trainingInfoBeans;
	}

	public void setTrainingInfoBeans(List<TrainingInfoBean> trainingInfoBeans) {
		this.trainingInfoBeans = trainingInfoBeans;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
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

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public DepartmentInfoBean getDepartmentInfoBean() {
		return departmentInfoBean;
	}

	public void setDepartmentInfoBean(DepartmentInfoBean departmentInfoBean) {
		this.departmentInfoBean = departmentInfoBean;
	}

	public EmployeeInfoBean getManagerId() {
		return managerId;
	}

	public void setManagerId(EmployeeInfoBean managerId) {
		this.managerId = managerId;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}// end of class
