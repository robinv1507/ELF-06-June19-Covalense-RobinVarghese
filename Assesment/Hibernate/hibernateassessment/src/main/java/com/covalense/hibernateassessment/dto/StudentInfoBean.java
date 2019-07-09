package com.covalense.hibernateassessment.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import lombok.Data;

@Data
@Entity
@Table(name = "student_info")
public class StudentInfoBean {

	private StudentOtherInfoBean otherInfoBean;
	@OneToOne(cascade = CascadeType.ALL)

	@PrimaryKeyJoinColumn
	@Id
	@Column(name = "rollNum")
	private int rollNum;
	@Column(name = "name")
	private String name;
	@Column(name = "gender")
	private String gender;
	@Column(name = "age")
	private int age;
	@Column(name = "mobileNo")
	private long mobileNo;

	@Column(name = "emailId")
	private String emailId;

}
