package com.covalense.hibernateapp.manytomany;

import java.util.Date;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;

public class App {
	public static void main(String[] args) {
		
		
		HibernateImpl impl = new HibernateImpl();
		
		EmployeeInfoBean employeeInfo1 = new EmployeeInfoBean();
		employeeInfo1.setId(1);

		employeeInfo1.setName("robin");
		employeeInfo1.setAge(26);
		employeeInfo1.setGender("male");
		employeeInfo1.setSalary(2300000);
		employeeInfo1.setPhone(989798989);
		employeeInfo1.setJoiningDate(new Date("2019/06/03"));
		employeeInfo1.setAcntNo(12012422);
		employeeInfo1.setEmail("robin@gmail.com");
		employeeInfo1.setDesignation("MD");
		employeeInfo1.setDob(new Date("1998/08/09"));
		//employeeInfo1.setDeptId(10);

		//emp 2
		EmployeeInfoBean employeeInfo2 = new EmployeeInfoBean();
		employeeInfo2.setId(02);
		employeeInfo2.setName("susmitha");
		employeeInfo2.setAge(26);
		employeeInfo2.setGender("female");
		employeeInfo2.setSalary(2300000);
		employeeInfo2.setPhone(989798989);
		employeeInfo2.setJoiningDate(new Date("2017/06/03"));
		employeeInfo2.setAcntNo(12012422);
		employeeInfo2.setEmail("susu@gmail.com");
		employeeInfo2.setDesignation("dev");
		employeeInfo2.setDob(new Date("1997/08/09"));
		//employeeInfo2.setDeptId(10);
		employeeInfo2.setManagerId(impl.getEmployeeinfo(employeeInfo1.getId()));
		
		EmployeeInfoBean employeeInfo3 = new EmployeeInfoBean();
		employeeInfo3.setId(03);

		employeeInfo3.setName("nilesh");
		employeeInfo3.setAge(26);
		employeeInfo3.setGender("male");
		employeeInfo3.setSalary(2300000);
		employeeInfo3.setPhone(989798989);
		employeeInfo3.setJoiningDate(new Date("2018/06/03"));
		employeeInfo3.setAcntNo(12012422);
		employeeInfo3.setEmail("nilu@gmail.com");
		employeeInfo3.setDesignation("tester");
		employeeInfo3.setDob(new Date("1999/08/09"));
		//employeeInfo3.setDeptId(10);
		employeeInfo3.setManagerId(impl.getEmployeeinfo(employeeInfo1.getId()));
		
		
		//impl.createEmployeeInfo(employeeInfo1);
		impl.createEmployeeInfo(employeeInfo2);
		impl.createEmployeeInfo(employeeInfo3);
		
		
		
	}

}
