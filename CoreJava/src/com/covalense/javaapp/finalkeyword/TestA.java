package com.covalense.javaapp.finalkeyword;

class P
{
	int q;
  final	int i=90;
  final int j;
  P()
  {
	  j=10;
  }
  P(int j)
  {
	  this.j=j;
  }
  
	
}
public class TestA {

	public static void main(String[] args) {

		P a=new P();
		System.out.println(a.j);
		P a1=new P(9);
		System.out.println(a.j);
		
		
		
	
	}

}
