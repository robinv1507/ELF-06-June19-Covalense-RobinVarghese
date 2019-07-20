package com.covalense.springcore.beans;

public class DepartmentBean {
	
	String deptName;
	int deptId;
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "DepartmentBean [deptName=" + deptName + ", deptId=" + deptId + "]";
	}
	
	
}
