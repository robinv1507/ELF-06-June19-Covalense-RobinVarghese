package com.covalense.javaapp.logger;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Amazonloger {
	private static final Logger loger = Logger.getLogger("amazon");

	public static void main(String[] args) {

		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);

		try {
			// creating log file
			FileHandler fh = new FileHandler("amazonlog.log", true);

			fh.setLevel(Level.SEVERE);// setting the level to file
			fh.setFormatter(new SimpleFormatter());
			loger.addHandler(fh);
			loger.log(Level.SEVERE, "hi loger started");

			Register r = new Register();
			r.connectDb();
			Login l = new Login();
			l.validateUser();

		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}

	}

}
