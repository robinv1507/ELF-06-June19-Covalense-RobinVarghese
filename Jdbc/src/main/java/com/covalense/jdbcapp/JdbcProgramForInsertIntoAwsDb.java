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
 * program to demonstrating the aws jdbc connectivity 
 */
 public class JdbcProgramForInsertIntoAwsDb {

	public static void main(String[] args) {

		
		
		String qry="insert into  employee_info(ID,NAME,DEPPT_ID,MANAGER_ID)"
				 + " values(20,'ranjith',10,213)";
		
		
		
		String dbUrl="jdbc:mysql://awsmysql.cyxiim9kvj2l.ap-south-1.rds.amazonaws.com:3306/covalense_db";
		
		try(
				 //2.get the db connection via driver
				Connection con=DriverManager.getConnection(dbUrl,"root","robinv1507") ;
				
				//3 issue "sql queries "via "connectiion"
				
				Statement stmt=con.createStatement();
				
						
				 ) {
			
			//1. load the driver
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			// or
             //  Class.forName("com.mysql.jdbc.Driver").newInstance();
    
			 log.info("connection impl class ==="+con.getClass());
			
			 int  rs=stmt.executeUpdate(qry);
			 
			 log.info(""+rs);
			 
			 
		} catch (SQLException e) {

		        log.info(""+e);
		}

		
	}//end of main

}//end of class
