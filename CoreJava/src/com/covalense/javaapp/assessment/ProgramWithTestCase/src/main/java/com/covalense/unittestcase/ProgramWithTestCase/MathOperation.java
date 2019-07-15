package com.covalense.unittestcase.ProgramWithTestCase;

/**
 * 
 * 
 *WAP to calculate simple interest, percentage, factorial and write the unit test case.
 */
public class MathOperation {

	double simpleInterest(double p,double n ,double r) {
		return (p*n*r)/100;
	}

	double percentage(int sub1 ,int sub2 ,int sub3) {
		return ((sub1+sub2+sub3)*100)/300;
	}

	int factorial(int number) {
		int fact =1;
		for (int i = 1; i <=number; i++) {
			fact=fact*i;
		}
		return fact;

	}
}
