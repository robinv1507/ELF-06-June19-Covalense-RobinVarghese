package com.covalense.emp.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="employee_addinfo")
@Data
public class EmployeeAddressInfoBean implements Serializable{

	@EmbeddedId
	private EmployeeAddressPKBean addPK;
	@Column(name="ADDRESS1")
	private String addressOne;	
	@Column(name="ADDRESS2")
	private String addressTwo;	
	@Column(name="LANDMARK")
	private String landmark;    
	@Column(name="CITY")
	private String city;        
	@Column(name="STATE")
	private String state;	    
	@Column(name="COUNTRY")
	private String country	;	
	@Column(name="PINCODE")
	private int pincode;	
	
	
}
