package com.covalense.hibernateapp.manytoone;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;

import lombok.Data;
@Data
@Embeddable
public class EmployeeAddressPKBean implements Serializable {
	@ManyToOne
	@JoinColumn(name="id")
	private EmployeeInfoBean infoBean;
	@Column(name="ADDRESS_TYPE")
	private String addressType;

}
