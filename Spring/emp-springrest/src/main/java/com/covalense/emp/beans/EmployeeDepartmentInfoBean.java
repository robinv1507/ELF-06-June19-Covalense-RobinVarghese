package com.covalense.emp.beans;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Entity
@Table(name ="department_info")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeDepartmentInfoBean {
	@Id
	@Column(name = "DEPT_ID")
	private int deptId;
	@Column(name = "DEPT_NAME")
	private String deptName;
	
	// getters and setters
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	

}// end of class
