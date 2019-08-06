package com.covalense.hibernateapp.onetoone;

import java.util.Date;

public class HiberanteOneToOneTestMain {
	public static void main(String[] args) {

		EmployeeInfoBean employeeInfo = new EmployeeInfoBean();
		employeeInfo.setId(11);

		employeeInfo.setName("suhair");
		employeeInfo.setAge(26);
		employeeInfo.setGender("male");
		employeeInfo.setSalary(2300000);
		employeeInfo.setPhone(989798989);
		employeeInfo.setJoiningDate(new Date("2010/06/02"));
		employeeInfo.setAcntNo(12012422);
		employeeInfo.setEmail("suhair2@gmail.com");
		employeeInfo.setDesignation("tester");
		employeeInfo.setDob(new Date("1996/03/03"));
		//employeeInfo.setDeptId(10);
		//employeeInfo.setManagerId(120);

		EmployeeOtherInfoBean otherInfo = new EmployeeOtherInfoBean();
		otherInfo.setAdhar(123456521L);
		otherInfo.setBloodGrp("o+ve");
		otherInfo.setChallenged(false);
		otherInfo.setEmergencyContactName("bijin");
		otherInfo.setEmergencyContactNumber(455555555L);
		otherInfo.setFatherName("jijl");
		otherInfo.setIsmarried(true);
		otherInfo.setMotherName("guery");
		otherInfo.setNationality("indian");
		
		otherInfo.setInfoBean(employeeInfo);
		
		HibernateOneToOneImpl impl=new HibernateOneToOneImpl();
		impl.createEmployee(employeeInfo, otherInfo);

	}//main end
}//class end
