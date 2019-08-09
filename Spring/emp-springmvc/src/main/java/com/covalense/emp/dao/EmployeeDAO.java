package com.covalense.emp.dao;

import java.util.List;

import com.covalense.emp.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	List<EmployeeInfoBean> getAllEmployeeInfo();

	EmployeeInfoBean getEmployeeInfo(int id);

	public List<EmployeeInfoBean> getSearchEmployeeInfo(int id);

	EmployeeInfoBean getEmployeeInfo(String id);

	boolean updateEmployeeinfo(EmployeeInfoBean bean);

	boolean deleteEmployeeinfo(int id);

	boolean deleteEmployeeinfo(String id);

	boolean createEmployeeinfo(EmployeeInfoBean empinfoBean, int managerId);

}
