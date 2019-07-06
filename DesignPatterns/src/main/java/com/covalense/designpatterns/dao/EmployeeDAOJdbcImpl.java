package com.covalense.designpatterns.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.covalense.designpatterns.beans.EmployeeInfoBean;
import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
/*
 * 
 */
public class EmployeeDAOJdbcImpl implements EmployeeDAO {

	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {

		String qry = "select * from employee_info";

		String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";

		try (
				// 2.get the db connection via driver
				Connection con = DriverManager.getConnection(dbUrl, "root", "root");
				// 3 issue "sql queries "via "connectiion"
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(qry);) {

			// 1. load the driver

			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			// or
			// Class.forName("com.mysql.jdbc.Driver").newInstance();

			ArrayList<EmployeeInfoBean> arraylist = new ArrayList<>();

			// 4."process the Results" returned by "sql queries"
			while (rs.next()) {
				EmployeeInfoBean bean = new EmployeeInfoBean();

				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setAge(rs.getInt("AGE"));
				bean.setGender(rs.getString("GENDER"));
				bean.setSalary(rs.getLong("SALARY"));
				bean.setPhone(rs.getLong("PHONE"));
				bean.setJoiningDate(rs.getDate("JOINING_DATE"));
				bean.setAccountNumber(rs.getInt("ACCOUNT_NO"));
				bean.setEmail(rs.getString("EMAIL"));
				bean.setDesignation(rs.getString("DESIGNATION"));
				bean.setDob(rs.getDate("DOB"));
				bean.setDepartmentId(rs.getInt("DEPPT_ID"));
				bean.setManagerId(rs.getInt("MANAGER_ID"));

				arraylist.add(bean);

			} // end of while
			return arraylist;

		} catch (SQLException e) {

			log.info("" + e);
			return null;
		}

	}// end of main

	public EmployeeInfoBean getEmployeeInfo(String id) {

		try {

			return getEmployeeInfo(Integer.parseInt(id));

		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}

	}// end of GetEmployeeInfo(String)

	public EmployeeInfoBean getEmployeeInfo(int id) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs;
		try {

			// 1. load the driver

			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			// or
			// Class.forName("com.mysql.jdbc.Driver").newInstance();

			// 2.get the db connection via driver

			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db?user=root&password=root";
			con = DriverManager.getConnection(dbUrl);

			log.info("connection impl class ===" + con.getClass());

			// 3 issue "sql queries "via "connectiion"

			String qry = "select * from employee_info where ID=?";

			pstmt = con.prepareStatement(qry);

			pstmt.setInt(1, id);

			rs = pstmt.executeQuery();

			// 4."process the Results" returned by "sql queries"
			EmployeeInfoBean bean = new EmployeeInfoBean();

			while (rs.next()) {

				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setAge(rs.getInt("AGE"));
				bean.setGender(rs.getString("GENDER"));
				bean.setSalary(rs.getLong("SALARY"));
				bean.setPhone(rs.getLong("PHONE"));
				bean.setJoiningDate(rs.getDate("JOINING_DATE"));
				bean.setAccountNumber(rs.getInt("ACCOUNT_NO"));
				bean.setEmail(rs.getString("EMAIL"));
				bean.setDesignation(rs.getString("DESIGNATION"));
				bean.setDob(rs.getDate("DOB"));
				bean.setDepartmentId(rs.getInt("DEPPT_ID"));
				bean.setManagerId(rs.getInt("MANAGER_ID"));

			} // end of while

			return bean;

		} catch (SQLException e) {

			log.info("" + e);
			return null;
		} finally {
			// 5.close all "jdbc objects"
			try {

				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}

			} catch (Exception e2) {

				log.info("" + e2);
			}

		} // finally block end

	}// end of getEmployeeInfo(int id)

	@Override
	public boolean CreateEmployeeinfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeinfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeinfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeinfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}// end of class
