package com.covalense.hibernateapp.awsrds;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="new_emp_info")

public class EmployeeNewInfoBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="eid")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	

}
