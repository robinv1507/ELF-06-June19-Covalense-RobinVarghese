package com.covalense.designpatterns;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.covalense.designpatterns.beans.EmployeeInfoBean;
import com.covalense.designpatterns.dao.EmployeeDAO;
import com.covalense.designpatterns.dao.EmployeeDAOFactory;
import com.covalense.designpatterns.dao.EmployeeDAOHibernateImpl;
import com.covalense.designpatterns.dao.EmployeeDAOJdbcImpl;

import lombok.extern.java.Log;

@Log
public class DesignPatternsTest {

	public static void main(String[] args) {

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();

		// fetching the first employee records passing the args int
		//printInfo(dao.getEmployeeInfo(1));
		// fetching the second employee records passing the args as string
		// printInfo(dao.getEmployeeInfo("2"));

		List<EmployeeInfoBean> beans = dao.getAllEmployeeInfo();
		for (EmployeeInfoBean bean : beans) {

			printInfo(bean);
		}

		EmployeeInfoBean employeeInfo = new EmployeeInfoBean();
		employeeInfo.setId(22);

		employeeInfo.setName("branesh");
		employeeInfo.setAge(26);
		employeeInfo.setGender("male");
		employeeInfo.setSalary(2300000);
		employeeInfo.setPhone(989798989);
		employeeInfo.setJoiningDate(new Date("2016/02/02"));
		employeeInfo.setAccountNumber(5646456456l);
		employeeInfo.setEmail("branesh@gmail.com");
		employeeInfo.setDesignation("tester");
		employeeInfo.setDob(new Date("1991/02/03"));
		employeeInfo.setDepartmentId(10);
		employeeInfo.setManagerId(120);

		// log.info("Inserted the employee info ? ans
		// :"+dao.CreateEmployeeinfo(employeeInfo));

		log.info("deleted the employee info ? ans :" + dao.deleteEmployeeinfo(22));
	}// end of main

	private static void printInfo(EmployeeInfoBean bean) {

		log.info("Id =>" + bean.getId());
		log.info("name =>" + bean.getName());
		log.info("phone =>" + bean.getPhone());
		log.info("email=>" + bean.getEmail());
		log.info("gender=>" + bean.getGender());
		log.info("Designation =>" + bean.getDesignation());
		log.info("Salary =>" + bean.getSalary());
	}
}// end of class
