package com.covalense.jdbcapp;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;
@Log
/*
 * program to demonstrating the jdbc connectivity
 */
 public class PreparedExampleOne {

	public static void main(String[] args) {

		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs;
		try {
			
			//1. load the driver
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			// or
             //  Class.forName("com.mysql.jdbc.Driver").newInstance();
            
		    //2.get the db connection via driver
			
			String dbUrl="jdbc:mysql://localhost:3306/covalense_db?user=root&password=root";
			 con=DriverManager.getConnection(dbUrl);
			 
			 log.info("connection impl class ==="+con.getClass());
			
			
			//3 issue "sql queries "via "connectiion"
			
				String qry="select * from employee_info where ID=?";		
			
	
			 pstmt=con.prepareStatement(qry);
			
		     pstmt.setInt(1, Integer.parseInt(args[0]));
		     rs=pstmt.executeQuery();
		     
		    	
				//4."process the Results" returned by "sql queries"
				if(rs.next()) {
					
					
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
		}finally {
			//5.close all "jdbc objects"
			try {
				
				  if(con!=null) {
					  con.close();
				  }
				  if(pstmt!=null) {
					  pstmt.close();
				  }
	
				
			} catch (Exception e2) {

				log.info(""+e2);
			}
			
			
		}//finally block end
		
		
		
		
	}//end of main

}//end of class
