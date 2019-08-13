package com.covalense.emp.beans;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@Entity
@Table(name="employee_addinfo")
@XmlAccessorType(XmlAccessType.FIELD)
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
	private Integer pincode;
	
	// getters and setters
	
	public EmployeeAddressPKBean getAddPK() {
		return addPK;
	}
	public void setAddPK(EmployeeAddressPKBean addPK) {
		this.addPK = addPK;
	}
	public String getAddressOne() {
		return addressOne;
	}
	public void setAddressOne(String addressOne) {
		this.addressOne = addressOne;
	}
	public String getAddressTwo() {
		return addressTwo;
	}
	public void setAddressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}	
	

	
	
}
