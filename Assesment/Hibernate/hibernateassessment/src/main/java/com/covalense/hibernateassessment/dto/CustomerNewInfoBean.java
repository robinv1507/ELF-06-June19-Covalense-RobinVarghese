package com.covalense.hibernateassessment.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "customerNewInfo")
public class CustomerNewInfoBean {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "fname")
	private String fname;
	@Column(name="lname")
	private String lname;
	@Column(name = "city")
	private String city;

}
