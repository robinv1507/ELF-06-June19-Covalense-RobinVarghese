package com.covalense.javaapp.assessment;

public class Temperature {
	

	
	public void validateServerRoomTemp(double temperature) {
		if (temperature > 35.00) {
				
				throw new TempCustomException("Temprature is above 35 degree ");		
		
		}//end of if
	}//end of validateServerRoomTemp()

}
