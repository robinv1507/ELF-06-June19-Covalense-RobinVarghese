package com.covalense.javaapp.logger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login {
	private static final Logger loger=Logger.getLogger("amazon");
    void validateUser()
    {
    	loger.log(Level.SEVERE, "Validating the user ");
    }

}
