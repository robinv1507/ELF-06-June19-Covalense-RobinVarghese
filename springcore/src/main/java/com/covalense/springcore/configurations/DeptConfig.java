package com.covalense.springcore.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.covalense.springcore.beans.DepartmentBean;
/*
 * Spring core -Auto wire using annotations
 */
@Configuration
public class DeptConfig {
	
	@Bean(name="hr")
	public DepartmentBean getDepartmentBeanHr() {
		
		DepartmentBean deptBean=new DepartmentBean();
		deptBean.setDeptId(100);
		deptBean.setDeptName("HR");
		
		return deptBean;
	}
	@Bean(name="it")
	public DepartmentBean getDepartmentBeanit() {
		
		DepartmentBean deptBean=new DepartmentBean();
		deptBean.setDeptId(101);
		deptBean.setDeptName("it");
		
		return deptBean;
	}
	@Bean(name="testing")
	public DepartmentBean getDepartmentBeanTesting() {
		
		DepartmentBean deptBean=new DepartmentBean();
		deptBean.setDeptId(102);
		deptBean.setDeptName("Testing");
		
		return deptBean;
	}

}
