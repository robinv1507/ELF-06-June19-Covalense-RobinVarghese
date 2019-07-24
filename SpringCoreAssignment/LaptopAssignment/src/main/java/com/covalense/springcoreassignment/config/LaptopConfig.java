package com.covalense.springcoreassignment.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import com.covalense.springcoreassignment.bean.Dell;
import com.covalense.springcoreassignment.bean.HardDisk;
import com.covalense.springcoreassignment.bean.Hp;
import com.covalense.springcoreassignment.interfaces.Laptop;
import com.covalense.springcoreassignment.interfaces.StorageDevice;

@Configuration
public class LaptopConfig {
	@Bean
	public Laptop getLaptop() {
		Dell dell = new Dell();
		dell.setBrand("inspiron");
		dell.setColor("black");
		dell.setCost(200000.0);
		dell.setOs("windows");
		dell.setWeight(2.3);
		return dell;
	}

	@Bean
	
	public Laptop getLaptopHP() {
	Hp hp=new Hp();
	hp.setBrand("c2");
	hp.setColor("black");
	hp.setCost(220000.0);
	hp.setOs("windows");
	hp.setWeight(2.3);
	return hp;
	}
	@Bean
	public StorageDevice getStorageDevice() {
		return new HardDisk();
	}

}
