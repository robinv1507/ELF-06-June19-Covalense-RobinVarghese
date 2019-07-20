package com.covalense.springcore.beans;

import com.covalense.springcore.interfaces.StorageDevice;

import lombok.Data;
import lombok.extern.java.Log;
@Log
@Data
public class PenDrive implements StorageDevice {
	
	private int capacity;
	private int writingSpeed;
	private int readSpeed;

	@Override
	public void write() {
		
    log.info("PenDrive write()");
	}

	@Override
	public void read() {
		 log.info("PenDrive read()");
	}

	@Override
	public void format() {
		 log.info("PenDrive format()");
	}

}
