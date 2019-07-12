package com.covalense.mywebapp.dao;

import java.util.List;
import com.covalense.mywebapp.beans.EmployeeDepartmentInfoBean;
import com.covalense.mywebapp.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	List<EmployeeInfoBean> getAllEmployeeInfo();

	EmployeeInfoBean getEmployeeInfo(int id);

	EmployeeInfoBean getEmployeeInfo(String id);
	
	boolean createEmployeeinfo(EmployeeInfoBean bean);
	
	boolean createDepartmentinfo(EmployeeDepartmentInfoBean bean);
	
	
	boolean updateEmployeeinfo(EmployeeInfoBean bean);
	boolean deleteEmployeeinfo( int id);
	boolean deleteEmployeeinfo( String id);
	
}
