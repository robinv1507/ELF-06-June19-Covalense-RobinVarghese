package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Embeddable
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeEducationalInfoPKBean implements Serializable {

	//@XmlTransient
		@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBean infoBean;

	@Column(name = "educational_type")
	private String educationalType;
	// getters and setters

	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}

	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}

	public String getEducationalType() {
		return educationalType;
	}

	public void setEducationalType(String educationalType) {
		this.educationalType = educationalType;
	}

	
	

}
