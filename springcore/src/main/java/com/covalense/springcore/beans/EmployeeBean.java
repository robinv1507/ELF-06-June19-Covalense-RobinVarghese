package com.covalense.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.extern.java.Log;
@Log
public class EmployeeBean //implements InitializingBean,DisposableBean 
{
	String name;
	int id;
	
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
		return "EmployeeBean [name=" + name + ", id=" + id + "]";
	}
	/*public void destroy() throws Exception {
		log.info("destroy phase");
		
	}
	public void init() throws Exception {
		
		log.info("initialization phase");
	}*/
	

	
}
