package com.covalense.javaapp.jodadatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import lombok.extern.java.Log;

@Log
/*
 * ZoneID demo
 */
public class ZoneIdDemo {
	public static void main(String[] args) {
		
		
		ZoneId z=ZoneId.systemDefault();
		
		log.info(""+z);
		
		ZoneId t=ZoneId.of("Australia/sydney");
		
		ZonedDateTime ze=ZonedDateTime.now(t);
		
		log.info(""+ze.toLocalDateTime());
	}

}
