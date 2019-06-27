package com.covalense.javaapp.logger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {
	private static final Logger loger=Logger.getLogger("amazon");
    void connectDb()
    {
    	loger.log(Level.SEVERE, " connecting to the DB ");
    }
	

}
