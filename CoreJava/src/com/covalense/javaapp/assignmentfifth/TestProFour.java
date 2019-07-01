package com.covalense.javaapp.assignmentfifth;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * WAP to store the  EMP objects into Array list and display 
  */
public class TestProFour {
	private static final Logger log = Logger.getLogger("bhavani");

	public static void main(String[] args) {
		ArrayList<EmpProFour> t = new ArrayList<EmpProFour>();
		EmpProFour e1 = new EmpProFour();
		e1.name = "robin";
		e1.id = 1;
		e1.salary = 20000;

		EmpProFour e2 = new EmpProFour();
		e2.name = "amal";
		e2.id = 2;
		e2.salary = 30000;

		EmpProFour e3 = new EmpProFour();
		e3.name = "saha";
		e3.id = 3;
		e3.salary = 15000;

		EmpProFour e4 = new EmpProFour();
		e4.name = "ram";
		e4.id = 4;
		e4.salary = 50000;

		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);

		for (EmpProFour e : t) {
			log.info("name=" + e.name + " id=" + e.id + " salary=" + e.salary);
		}//for loop end

	}//main end
}//class end
