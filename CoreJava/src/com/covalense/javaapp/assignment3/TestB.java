package com.covalense.javaapp.assignment3;

public class TestB {

	public static void main(String[] args) {

		Product c[]=new Product[4];
		
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		Product p4=new Product();
		
		p1.setPname("Iphone");
		p1.setPid(01);
		p1.setPrice(1000000);
		
		p2.setPname("mi a2");
		p2.setPid(02);
		p2.setPrice(10000);
		
		p3.setPname("Lg G2");
		p3.setPid(03);
		p3.setPrice(20000);
		
		p4.setPname("Sony f1");
		p4.setPid(04);
		p4.setPrice(500000);
		
		c[0]=p1;
		c[1]=p2;
		c[2]=p3;
		c[3]=p4;
		
		
		for (int i = 0; i < c.length; i++) {

			System.out.println("#product name is " + c[i].getPname());
			System.out.println("\n#Price is " + c[i].getPrice());
			System.out.println("\n#Id is " + c[i].getPid());
			System.out.println("\n***************");

		}
		
		
		
		
	}

}
