package com.covalense.jdbcapp;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;
@Log
/*
 * program to demonstrating the jdbc connectivity
 */
 public class JdbcProgramForAwsDb {

	public static void main(String[] args) {

		
		
		String qry="select * from employee_info";
		
		String dbUrl="jdbc:mysql://awsmysql.cyxiim9kvj2l.ap-south-1.rds.amazonaws.com:3306/covalense_db";		
		try(
				 //2.get the db connection via driver
				Connection con=DriverManager.getConnection(dbUrl,"root","robinv1507") ;
				
				//3 issue "sql queries "via "connectiion"
				
				Statement stmt=con.createStatement();
				  ResultSet  rs=stmt.executeQuery(qry);) {
			
			//1. load the driver
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			// or
             //  Class.forName("com.mysql.jdbc.Driver").newInstance();
    
			 log.info("connection impl class ==="+con.getClass());
			
			
			//4."process the Results" returned by "sql queries"
			while(rs.next()) {
				
				
				log.info(" ID       		===>  "+rs.getInt("ID"));
				log.info(" NAME    	        ===>  "+rs.getString("NAME"));
				log.info(" AGE    			===>  "+rs.getInt("AGE"));
				log.info(" GENDER 			===>  "+rs.getString("GENDER"));
				log.info(" SALARY   		===>  "+rs.getDouble("SALARY"));
				log.info(" PHONE    		===>  "+rs.getLong("PHONE"));
				log.info(" JOINING_DATE		===>  "+rs.getDate("JOINING_DATE"));
				log.info(" ACCOUNT_NO  		===>  "+rs.getInt("ACCOUNT_NO"));
				log.info(" EMAIL      		===>  "+rs.getString("EMAIL"));
				log.info(" DESIGNATION 		===>  "+rs.getString("DESIGNATION"));
				log.info(" DOB         		===>  "+rs.getDate("DOB"));
				log.info(" DEPT_ID  		===>  "+rs.getInt("DEPPT_ID"));
				log.info(" (MANAGER_ID)		===>  "+rs.getInt("MANAGER_ID"));
				
			
			}//end of while
						
		
		} catch (SQLException e) {

		log.info(""+e);
		}

		
	}//end of main

}//end of class
