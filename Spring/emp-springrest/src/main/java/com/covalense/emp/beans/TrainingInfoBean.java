package com.covalense.emp.beans;

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
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public List<EmployeeInfoBean> getInfoBeans() {
		return infoBeans;
	}
	public void setInfoBeans(List<EmployeeInfoBean> infoBeans) {
		this.infoBeans = infoBeans;
	}
	
	
	

}
