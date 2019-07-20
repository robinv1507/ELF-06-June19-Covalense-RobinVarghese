package com.covalense.springcore.beans;

import com.covalense.springcore.interfaces.StorageDevice;

import lombok.Data;
import lombok.extern.java.Log;
@Log
@Data
public class HardDisk implements StorageDevice {
	private int capacity;
	private int writingSpeed;
	private int readSpeed;
	

	@Override
	public void write() {
		
    log.info("HardDisk write()");
	}

	@Override
	public void read() {
		 log.info("HardDisk read()");
	}

	@Override
	public void format() {
		 log.info("HardDisk format()");
	}

}
