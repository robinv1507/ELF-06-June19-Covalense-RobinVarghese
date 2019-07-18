package com.covalense.hibernateapp.util;

import java.util.Date;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;
import com.covalense.hibernateapp.onetoone.EmployeeOtherInfoBean;

public class PreparedDataUtil {
	
	private PreparedDataUtil() {}
	
	static public EmployeeInfoBean PrepareData(int id) {

		
		EmployeeInfoBean employeeInfo = new EmployeeInfoBean();
		employeeInfo.setId(id);

		employeeInfo.setName("ramjith");
		employeeInfo.setAge(26);
		employeeInfo.setGender("male");
		employeeInfo.setSalary(2300000);
		employeeInfo.setPhone(989798989);
		employeeInfo.setJoiningDate(new Date("2016/02/02"));
		employeeInfo.setAcntNo(12012422);
		employeeInfo.setEmail("ramjith323@gmail.com");
		employeeInfo.setDesignation("tester");
		employeeInfo.setDob(new Date("1991/02/03"));

		employeeInfo.setDeptId(10);
		employeeInfo.setManagerId(120);
		
		EmployeeOtherInfoBean otherInfo=new EmployeeOtherInfoBean();
		otherInfo.setAdhar(123456521L);
		otherInfo.setBloodGrp("o+ve");
		otherInfo.setChallenged(false);
		otherInfo.setEmergencyContactName("bijin");
		otherInfo.setEmergencyContactNumber(455555555L);
		otherInfo.setFatherName("jijl");
		otherInfo.setId(id);
		otherInfo.setIsmarried(true);
		otherInfo.setMotherName("guery");
		otherInfo.setNationality("indian");
		
		employeeInfo.setOtherInfo(otherInfo);
		
				return employeeInfo;
	}

}
