package com.covalense.springcore.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.covalense.springcore.beans.MessageBean;
@Configuration
/*
 * MessageConfig file with spring bean config annotattions
 */
public class MessageConfig {
	@Bean
	@Scope("prototype")
	public MessageBean getMessageBean() {
		
		MessageBean messageBean=new MessageBean();
		messageBean.setMessage("Hello world");

           return messageBean;
	}

}
