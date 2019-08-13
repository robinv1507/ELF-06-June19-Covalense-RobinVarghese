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
public class EmployeeExperienceInfoPKBean implements Serializable {
	@XmlTransient
	@ManyToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBean infoBean; 
	@Column(name="company_name")
	private String companyName;
	// getters and setters
	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}
	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	

}//end of class
