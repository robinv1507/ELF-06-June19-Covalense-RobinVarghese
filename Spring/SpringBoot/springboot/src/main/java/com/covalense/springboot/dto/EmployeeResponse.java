package com.covalense.springboot.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;
@Data
@JsonRootName("employee-response")
public class EmployeeResponse {
	
	@JsonProperty("status-Code")
	private int statusCode;

	private String msg;

	private String description;
	@JsonProperty("data")
	private List<EmployeeInfoBean> bean;
	

}
