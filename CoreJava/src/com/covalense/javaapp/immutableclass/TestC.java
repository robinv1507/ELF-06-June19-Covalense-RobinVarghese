package com.covalense.javaapp.immutableclass;

import lombok.extern.java.Log;

@Log
public class TestC {

	public static void main(String[] args) {

		Marker m1 = Marker.getM();
		log.info("" + m1);

	}//main end

}//class end
