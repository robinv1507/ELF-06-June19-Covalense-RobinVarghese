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
		Dell dell = new Dell();
		dell.setBrand("inspiron");
		dell.setColor("black");
		dell.setCost(200000.0);
		dell.setOs("windows");
		dell.setWeight(2.3);
		log.info("" +dell.getBrand());
		log.info("" + dell.getColor());
		log.info("" +dell.getCost());
		log.info("" +dell.getRam());
		log.info("" +dell.getWeight());
		log.info("" +dell.getOs());
		device.read();
	}
}
