package com.covalense.springboot.dto;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Data
@Entity
@Table(name = "training_info")
//@XmlAccessorType(XmlAccessType.FIELD)
public class TrainingInfoBean {
	
	@Id
	@Column(name = "Course_ID")
	private int courseID;
	@Column(name = "Course_name")
	private String courseName;
	@Column(name = "Duration")
	private int duration;
	@Column(name = "Course_Type")
	private String courseType;
	//@XmlTransient
		@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Employee_Training_info", joinColumns = {
			@JoinColumn(name = "Course_ID") }, inverseJoinColumns = { @JoinColumn(name = "id") })

	private List<EmployeeInfoBean> infoBeans;
	
	// getters and setters

	

}
