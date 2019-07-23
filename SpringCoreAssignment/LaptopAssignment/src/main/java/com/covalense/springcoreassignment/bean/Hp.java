package com.covalense.springcoreassignment.bean;
import org.springframework.beans.factory.annotation.Autowired;

import com.covalense.springcoreassignment.interfaces.Laptop;
import com.covalense.springcoreassignment.interfaces.StorageDevice;

import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class Hp implements Laptop {
	private String brand;
	private String color;
	private double cost;
	private double weight;
	private int ram;
	private String os;
	@Autowired
	private StorageDevice device;
	public void display() {

	}

	public void process() {

	}
	public void showSpecificatiion() {
		Hp hp=new Hp();
		hp.setBrand("c2");
		hp.setColor("black");
		hp.setCost(220000.0);
		hp.setOs("windows");

		log.info("" + getBrand());
		log.info("" + getColor());
		log.info("" + getCost());
		log.info("" + getRam());
		log.info("" + getWeight());
		log.info("" + getOs());

	}
}
