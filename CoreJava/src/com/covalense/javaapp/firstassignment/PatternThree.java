package com.covalense.javaapp.firstassignment;

public class PatternThree {

	public static void main(String[] args) {


		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{

				System.out.print("*");
			}
			System.out.print("\n");
			if((i-1)==3)
			{
				for(int p=3;p>=0;p--)
				{
					for (int l= 1; l <= p; l++) 
					{

						System.out.print("*");
					}
					System.out.print("\n");
				}
				
			}
		}
	}

}
