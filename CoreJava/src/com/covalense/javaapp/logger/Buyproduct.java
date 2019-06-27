package com.covalense.javaapp.logger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Buyproduct {
	private static final Logger loger=Logger.getLogger("Flipkart");
	
	void BuyProduct()
	{
		loger.log(Level.SEVERE, "  Buy pruduct button clicked");
	}

}
