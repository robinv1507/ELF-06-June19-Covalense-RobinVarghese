package com.covalense.hibernateapp.hqlcreateria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
/*
 * Hibernate- fetching the records using Criteria
 */
public class GetAllRecord {
	public static void main(String[] args) {

		Session session = HibernateUtil.openSession();

		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);

		Criterion criterion = Restrictions.between("salary",2000.0,300000.0);
		criteria.add(criterion);
		//EmployeeInfoBean bean=(EmployeeInfoBean)criteria.uniqueResult();
		List<EmployeeInfoBean> emp = criteria.list();

		for (EmployeeInfoBean bean : emp) {
			log.info("Id =>" + bean.getId());
			log.info("name =>" + bean.getName());
			log.info("phone =>" + bean.getPhone());
			log.info("email=>" + bean.getEmail());
			log.info("gender=>" + bean.getGender());
			log.info("Designation =>" + bean.getDesignation());
			log.info("Salary =>" + bean.getSalary());
		} // end of for loop

	}// end of main

}// end of class
