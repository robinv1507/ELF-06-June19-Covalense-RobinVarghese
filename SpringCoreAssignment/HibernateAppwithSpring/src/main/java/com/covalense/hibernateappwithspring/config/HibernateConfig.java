package com.covalense.hibernateappwithspring.config;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class HibernateConfig {
	@Bean
	public  SessionFactory getSessionFactory() {
		return  new Configuration().configure().buildSessionFactory() ;
		
	}
}// end of class



