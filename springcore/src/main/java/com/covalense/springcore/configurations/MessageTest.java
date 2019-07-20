package com.covalense.springcore.configurations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.covalense.springcore.beans.MessageBean;
import lombok.extern.java.Log;
@Log
/*
 * Spring Core:
 * bean config using annotations 
 */
public class MessageTest {
	public static void main(String[] args) {
				
		ApplicationContext applicationContext=
				     new AnnotationConfigApplicationContext(MessageConfig.class);
		((ConfigurableApplicationContext)applicationContext).registerShutdownHook();
		
		MessageBean messageBean1=applicationContext.getBean(MessageBean.class);
		MessageBean messageBean2=applicationContext.getBean(MessageBean.class);
		
		log.info(messageBean1.getMessage());
	   log.info(messageBean2.getMessage());
	   
	   messageBean2.setMessage("welcome to Spring core");
	   log.info(messageBean1.getMessage());
	   log.info(messageBean2.getMessage());
	   
	   ((ConfigurableApplicationContext)applicationContext).close();
	   
		
	}//end of main

}//end of class
