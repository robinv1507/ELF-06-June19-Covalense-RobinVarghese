package com.covalense.hibernateapp.cache;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;

@Data
@Entity
@Table(name="new_emp_info")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)

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
