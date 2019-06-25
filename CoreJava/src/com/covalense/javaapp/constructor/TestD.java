package com.covalense.javaapp.constructor;
class A
{
	int i=98;
}
class B extends A
{
	int i=50;
  void rj()
  {
	  int i=2;
	  System.out.println(i);
	  System.out.println(this.i);
	  System.out.println(super.i);
  }

}





public class TestD {

	public static void main(String[] args) {
  
		
		B n=new B();
		n.rj();
		
	}

}
