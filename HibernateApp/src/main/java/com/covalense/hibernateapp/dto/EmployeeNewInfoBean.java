package com.covalense.hibernateapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="new_emp_info")

public class EmployeeNewInfoBean {
	
	@Id
	@Column(name="eid")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	

}
