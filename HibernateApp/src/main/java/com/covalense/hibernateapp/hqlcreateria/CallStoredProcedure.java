package com.covalense.hibernateapp.hqlcreateria;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
/*
 * Hibernate- StoredProcedureQuery demo
 */
public class CallStoredProcedure {
	public static void main(String[] args) {

		Session session = HibernateUtil.openSession();

		StoredProcedureQuery query = session.createStoredProcedureCall("allemp", EmployeeInfoBean.class);

		List<EmployeeInfoBean> employeeBeanList = query.getResultList();

		for (EmployeeInfoBean bean : employeeBeanList) {
			log.info("Id =>" + bean.getId());
			log.info("name =>" + bean.getName());
			log.info("phone =>" + bean.getPhone());
			log.info("email=>" + bean.getEmail());
			log.info("gender=>" + bean.getGender());
			log.info("Designation =>" + bean.getDesignation());
			log.info("Salary =>" + bean.getSalary());
		}

		session.close();

		// end of for loop

	}// end of main

}// end of class
