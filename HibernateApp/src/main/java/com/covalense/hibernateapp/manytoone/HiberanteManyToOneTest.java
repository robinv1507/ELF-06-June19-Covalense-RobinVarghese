package com.covalense.hibernateapp.manytoone;

import java.util.Arrays;
import java.util.Date;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;
import com.covalense.hibernateapp.onetoone.EmployeeOtherInfoBean;
public class HiberanteManyToOneTest {
	public static void main(String[] args) {

		EmployeeInfoBean employeeInfo = new EmployeeInfoBean();
		employeeInfo.setId(65);

		employeeInfo.setName("suhair");
		employeeInfo.setAge(26);
		employeeInfo.setGender("male");
		employeeInfo.setSalary(2300000);
		employeeInfo.setPhone(989798989);
		employeeInfo.setJoiningDate(new Date("2019/06/03"));
		employeeInfo.setAcntNo(12012422);
		employeeInfo.setEmail("suhair2@gmail.com");
		employeeInfo.setDesignation("tester");
		employeeInfo.setDob(new Date("1998/08/09"));
		//employeeInfo.setDeptId(10);
		//employeeInfo.setManagerId(120);
		/*==============EmployeeOtherInfoBean================*/
		
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
		/*==============EmployeeAddressPKBean================*/
		EmployeeAddressPKBean addressPKBean1=new EmployeeAddressPKBean();
		addressPKBean1.setAddressType("T");
		addressPKBean1.setInfoBean(employeeInfo);
		
		EmployeeAddressPKBean addressPKBean2=new EmployeeAddressPKBean();
		addressPKBean2.setAddressType("P");
		addressPKBean2.setInfoBean(employeeInfo);
		
		EmployeeAddressInfoBean addressInfo1 = new EmployeeAddressInfoBean();
		addressInfo1.setAddPK(addressPKBean1);
		addressInfo1.setAddressOne("bangalore");

		EmployeeAddressInfoBean addressInfo2 = new EmployeeAddressInfoBean();
		addressInfo2.setAddPK(addressPKBean2);
		addressInfo2.setAddressOne("mumbai");
		
		/*============EmployeeEducationalInfoPKBean====*/
		EmployeeEducationalInfoPKBean empEducPkBean1=new EmployeeEducationalInfoPKBean();
		empEducPkBean1.setEducationalType("Distance");
		empEducPkBean1.setInfoBean(employeeInfo);
		
		EmployeeEducationalInfoPKBean empEducPkBean2=new EmployeeEducationalInfoPKBean();
		empEducPkBean2.setEducationalType("Ragular");
		empEducPkBean2.setInfoBean(employeeInfo);

		EmployeeEducationalInfoBean empEdInfoBean1=new EmployeeEducationalInfoBean();
		empEdInfoBean1.setEducationalInfoPKBean(empEducPkBean1);
		empEdInfoBean1.setBranch("cs");
		empEdInfoBean1.setCollegeName("cfcs");
		empEdInfoBean1.setDegreeType("abc");
		empEdInfoBean1.setLocation("bangalore");
		empEdInfoBean1.setUniversity("bangalore");
		empEdInfoBean1.setYop(new Date("1996/03/03"));
		
		
		EmployeeEducationalInfoBean empEdInfoBean2=new EmployeeEducationalInfoBean();
		empEdInfoBean2.setEducationalInfoPKBean(empEducPkBean2);
		empEdInfoBean2.setBranch("bsc");
		empEdInfoBean2.setCollegeName("cfcs");
		empEdInfoBean2.setDegreeType("abc");
		empEdInfoBean2.setLocation("bangalore");
		empEdInfoBean2.setUniversity("bangalore");
		empEdInfoBean2.setYop(new Date("1999/03/03"));
		/*================EmployeeExperienceInfoPKBean============*/
		EmployeeExperienceInfoPKBean employeeExperienceInfoPKBean1=new EmployeeExperienceInfoPKBean();
		employeeExperienceInfoPKBean1.setCompanyName("covalense");
		employeeExperienceInfoPKBean1.setInfoBean(employeeInfo);
		
		EmployeeExperienceInfoPKBean employeeExperienceInfoPKBean2=new EmployeeExperienceInfoPKBean();
		employeeExperienceInfoPKBean2.setCompanyName("testyantra");
		employeeExperienceInfoPKBean2.setInfoBean(employeeInfo);
		
		EmployeeExperienceInfoBean experienceInfoBean1=new EmployeeExperienceInfoBean();
		experienceInfoBean1.setDesignation("dev");
		experienceInfoBean1.setEmpPkBean(employeeExperienceInfoPKBean1);
		experienceInfoBean1.setJoiningDate(new Date("2014/03/03"));
		experienceInfoBean1.setLeavingDate(new Date("2016/03/03"));
		
		EmployeeExperienceInfoBean experienceInfoBean2=new EmployeeExperienceInfoBean();
		experienceInfoBean2.setDesignation("dev");
		experienceInfoBean2.setEmpPkBean(employeeExperienceInfoPKBean2);
		experienceInfoBean2.setJoiningDate(new Date("2016/03/03"));
		experienceInfoBean2.setLeavingDate(new Date("2018/03/03"));
		
		HibernateManyToOneImpl impl=new HibernateManyToOneImpl();
		impl.createEmployee(employeeInfo, otherInfo
				,Arrays.asList(empEdInfoBean1,empEdInfoBean2)
				,Arrays.asList(addressInfo1,addressInfo2)
				,Arrays.asList(experienceInfoBean1,experienceInfoBean1));

	}//main end
}//class end
