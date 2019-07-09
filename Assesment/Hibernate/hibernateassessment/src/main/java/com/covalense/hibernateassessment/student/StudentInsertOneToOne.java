package com.covalense.hibernateassessment.student;

import com.covalense.hibernateassessment.dto.StudentInfoBean;
import com.covalense.hibernateassessment.dto.StudentOtherInfoBean;
/*
*Question 10.
* Establish a relationship between following Entities, Using Hibernate Annotations (One-To-One).
*/
public class StudentInsertOneToOne {

	public static void main(String[] args) {
         
		StudentInfoBean studentInfoBean = new StudentInfoBean();
		studentInfoBean.setRollNum(02);
		studentInfoBean.setName("robin");

		StudentOtherInfoBean otherInfoBean = new StudentOtherInfoBean();
		otherInfoBean.setRollNum(02);
		otherInfoBean.setFatherName("varghese");
        //one to one main logic
		studentInfoBean.setOtherInfoBean(otherInfoBean);

	}// end of main

}// end of class
