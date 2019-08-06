package com.covalense.hibernateapp.manytomany;

import java.util.Arrays;
import java.util.Date;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;

public class HiberanteManyToManyTest {
	public static void main(String[] args) {
		
		HibernateImpl impl = new HibernateImpl();
		
		EmployeeInfoBean infoBean1=impl.getEmployeeinfo(2);
		EmployeeInfoBean infoBean2=impl.getEmployeeinfo(3);
		
		
		TrainingInfoBean trainingInfoBean=new TrainingInfoBean();
		trainingInfoBean.setCourseID(100);
		trainingInfoBean.setCourseName("java");
		trainingInfoBean.setCourseType("fulltime");
		trainingInfoBean.setDuration(2);
		trainingInfoBean.setInfoBeans(Arrays.asList(infoBean1
				 ,infoBean2));

		impl.createTrainingInfo(trainingInfoBean);

	}// main end
}// class end
