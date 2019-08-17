package com.covalense.springboot.dto;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import lombok.Data;

@Entity
@Table(name = "department_info")
//@XmlAccessorType(XmlAccessType.FIELD)
public class DepartmentInfoBean implements Serializable {

	@Id
	@Column(name = "DEPT_ID")
	private Integer deptId;
	@Column(name = "dept_name")
	private String deptName;
	
	//getters and setters
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	

}
