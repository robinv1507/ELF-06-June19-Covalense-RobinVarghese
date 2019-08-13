package com.covalense.emp.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Entity
@Table(name="employee_educational_info")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeEducationalInfoBean implements Serializable{
	@EmbeddedId
	private EmployeeEducationalInfoPKBean educationalInfoPKBean;
	
	@Column(name="degree_type")
	private String degreeType;	

	@Column(name="branch")
	private String branch;			 

	@Column(name="college_nm")
	private String collegeName;    
	
	@Column(name="university")
	private String university;      
	
	@Column(name="percentage")
	private Double percentage;      
	
	@Column(name="location")
	private String location;		
	
	@Column(name="yop")
	private Date yop;
	
	// getters and setters

	public EmployeeEducationalInfoPKBean getEducationalInfoPKBean() {
		return educationalInfoPKBean;
	}

	public void setEducationalInfoPKBean(EmployeeEducationalInfoPKBean educationalInfoPKBean) {
		this.educationalInfoPKBean = educationalInfoPKBean;
	}

	public String getDegreeType() {
		return degreeType;
	}

	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getYop() {
		return yop;
	}

	public void setYop(Date yop) {
		this.yop = yop;
	}   
	


}//end of class
