package com.covalense.unittestcase.ProgramWithTestCase;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class MathOpearationTestCase {
	
	private  MathOperation mathOperation = new MathOperation();
		

	@Test
	public void simpleInterest() {
		assertEquals(3750.0,mathOperation.simpleInterest(6000, 12.5, 5),0);
	}
	
	@Test
	public void percentage() {
		assertEquals(60, mathOperation.percentage(50, 60, 70),0);
		
	}
	
	@Test 
	public void factorial() {
		assertEquals(120, mathOperation.factorial(5));
		
	}

}
