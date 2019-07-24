package com.covalense.springcoreassignment.bean;

import org.springframework.beans.factory.annotation.Autowired;

import com.covalense.springcoreassignment.interfaces.Laptop;
import com.covalense.springcoreassignment.interfaces.StorageDevice;

import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class Dell implements Laptop {
	private String brand;
	private String color;
	private double cost;
	private double weight;
	private int ram = 4;
	private String os;
	@Autowired
	private StorageDevice device;

	public void display() {

	}

	public void process() {

	}

	public void showSpecificatiion() {
	
		log.info("" +getBrand());
		log.info("" + getColor());
		log.info("" +getCost());
		log.info("" +getRam());
		log.info("" +getWeight());
		log.info("" +getOs());
		device.read();
	}
}
