package com.covalense.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.extern.java.Log;
@Log
public class MessageBean {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

  @PreDestroy
  public void destroy()  {
    log.info("destroy phase");
    
  }
  @PostConstruct
  public void init() {

	 log.info("initialization phase");
 }

}
