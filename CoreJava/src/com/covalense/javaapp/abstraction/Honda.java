package com.covalense.javaapp.abstraction;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Honda {
	Logger l=Logger.getLogger("honda");
	
	void engine()
	{
		l.log(Level.INFO, "Iam a engine body");
	}
   abstract	void design();
	

}
