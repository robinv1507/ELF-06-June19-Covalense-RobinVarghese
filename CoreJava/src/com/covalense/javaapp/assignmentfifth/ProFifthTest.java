package com.covalense.javaapp.assignmentfifth;

import java.util.TreeSet;
import java.util.logging.Logger;

/*
 * WAP to sort the mobile object based on the price
 */
public class ProFifthTest {

private static final Logger log=Logger.getLogger("bhavani");

	public static void main(String[] args) {
		TreeSet<MobileProFive> t = new TreeSet<MobileProFive>();
		MobileProFive m1 = new MobileProFive();
		m1.set("MI", 20000, "MI");
		MobileProFive m2 = new MobileProFive();
		m2.set("IPhone", 100000, "apple");
		MobileProFive m3 = new MobileProFive();
		m3.set("note 2 MI ", 8000, "MI");
		MobileProFive m4 = new MobileProFive();
		m4.set("galaxy 2", 20000, "sam");
		MobileProFive m5 = new MobileProFive();
		m5.set("note 5", 20000, "sam");
		t.add(m1);
		t.add(m2);
		t.add(m3);
		t.add(m4);
		t.add(m5);

		for (MobileProFive p : t) {
			log.info("name=" + p.name + " cost= " + p.cost + " brand=" + p.brand);
		}
	}

}
