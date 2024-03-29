package com.covalense.hibernateappwithspring.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table(name="employee_otherinfo")

public class EmployeeOtherInfoBean {
	
	@Id
	@Column(name="ID")
	private int id	;	
	@Column(name="ISMARRIED")
	private boolean ismarried;   
	@Column(name="PAN ")
	private String pan;   
	@Column(name="BLOOD_GROUP ")
	private String bloodGrp;
	@Column(name="ISCHALLENGED")
	private boolean isChallenged;
	@Column(name="EMERGENCY_NUMBER")
	private long emergencyContactNumber;
	@Column(name="EMERGENCY_CONTACT_NAME")
	private String emergencyContactName;  
	@Column(name="NATIONALITY")
	private String nationality;	
	@Column(name="RELIGION")
	private String religion;
	@Column(name="FATHER_NM")
	private String fatherName;
	@Column(name="MOTHER_NM")
	private String motherName;				  			  
	@Column(name="PASSPORT")
	private long passport;
	@Column(name="ADHAAR")
	private long adhar;		
	@Column(name="SPOUSE_NM")
	private String spouseName;


}//end of class
