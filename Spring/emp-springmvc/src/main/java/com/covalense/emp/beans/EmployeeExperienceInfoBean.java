package com.covalense.emp.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="employee_experience_info")
@Data
public class EmployeeExperienceInfoBean implements Serializable {
	@EmbeddedId
	private EmployeeExperienceInfoPKBean empPkBean;
	@Column(name="designation")
	private String designation;
	@Column(name="joining_date")
	private Date joiningDate;
	@Column(name="leaving_date")
	private Date leavingDate;


}//end of class
