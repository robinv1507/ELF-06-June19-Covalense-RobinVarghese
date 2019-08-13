package com.covalense.emp.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

@Embeddable
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeAddressPKBean implements Serializable {
	@XmlTransient
	@ManyToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBean infoBean;
	@Column(name = "ADDRESS_TYPE")
	private String addressType;
	// getters and setters
	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}
	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	

	

}
