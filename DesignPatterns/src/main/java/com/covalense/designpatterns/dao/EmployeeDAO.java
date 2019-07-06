package com.covalense.designpatterns.dao;

import java.util.ArrayList;

import com.covalense.designpatterns.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	ArrayList<EmployeeInfoBean> getAllEmployeeInfo();

	EmployeeInfoBean getEmployeeInfo(int id);

	EmployeeInfoBean getEmployeeInfo(String id);
	
	boolean CreateEmployeeinfo(EmployeeInfoBean bean);
	
	boolean updateEmployeeinfo(EmployeeInfoBean bean);
	boolean deleteEmployeeinfo( int id);
	boolean deleteEmployeeinfo( String id);
	
}
