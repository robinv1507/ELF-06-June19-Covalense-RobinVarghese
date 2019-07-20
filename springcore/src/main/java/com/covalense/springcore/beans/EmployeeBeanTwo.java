package com.covalense.springcore.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.extern.java.Log;
@Log
/*
 * Spring core -Auto wire using annotation
 */
public class EmployeeBeanTwo
{
	String name;
	int id;
	@Autowired
	@Qualifier("it")
	private DepartmentBean departmentBean;
	
	
	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}
	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "EmployeeBeanTwo [name=" + name + ", id=" + id + ", departmentBean=" + departmentBean + "]";
	}
	

	
}
