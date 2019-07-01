package com.covalense.javaapp.assignmentfifth;

import java.util.Comparator;

public class EmpByName implements Comparator<ProSixEmp> {

	@Override
	public int compare(ProSixEmp o1, ProSixEmp o2) {
		return o1.name.compareTo(o2.name);
	}
	

}
