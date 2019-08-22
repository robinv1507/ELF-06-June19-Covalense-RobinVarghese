package com.covalense.lms.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("lms-response")
public class ResponseData {
	
	private int statusCode;
 
	private String msg;

	private String description;
	@JsonProperty("userData")
	private List<UserBean> userBean;
	@JsonProperty("bookData")
	private List<BookBean> bookBean;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<UserBean> getUserBean() {
		return userBean;
	}
	public void setUserBean(List<UserBean> userBean) {
		this.userBean = userBean;
	}
	public List<BookBean> getBookBean() {
		return bookBean;
	}
	public void setBookBean(List<BookBean> bookBean) {
		this.bookBean = bookBean;
	}
	

}
