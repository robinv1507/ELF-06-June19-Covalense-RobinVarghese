package com.covalense.hibernateapp.hqlcreateria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
/*
 * Hibernate- fetching the records using projection
 */
public class GetDetailsProjection {
	public static void main(String[] args) {

		Session session = HibernateUtil.openSession();

		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);

		Projection projection1 = Projections.property("id");
		Projection projection2 = Projections.property("name");
		ProjectionList projectionList = Projections.projectionList();

		projectionList.add(projection1);
		projectionList.add(projection2);

		criteria.setProjection(projectionList);

		List<Object[]> emp = criteria.list();

		for (Object[] bean : emp) {
			log.info("Id =>" + bean[0]);
			log.info("name =>" + bean[1]);

		} // end of for loop

	}// end of main

}// end of class
