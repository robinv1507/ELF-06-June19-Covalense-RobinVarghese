package com.covalense.javaapp.firstassignment;

public class PatternTen {
	static void diamondPattern()
	{

        int rows =5;
        
        for (int i=1; i<=rows; i++)
        {
            // Print space in decreasing order
            for (int j=rows; j>i; j--)
            {
                System.out.print(" ");
            }
            // Print star in increasing order
            for (int k=1; k<=(i * 2) -1; k++)
            {
                if( k == 1 || k == (i * 2) -1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=rows-1; i>=1; i--)
        {
         // Print space in increasing order
            for (int j=rows-1; j>=i; j--)
            {
                System.out.print(" ");
            }
            // Print star in decreasing order
            for (int k=1; k<=(i * 2) -1; k++)
            {
                if( k == 1 || k == (i * 2) -1 )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            
            
            System.out.println();
        }
	}
	
	static void crossPattern()
	{

		int rows = 5;
        System.out.println("## Printing the pattern ##");
        
        // Print i number of stars
        for (int i=1; i<=(rows * 2 -1); i++)
        {
            if( i == rows)
            {
                // Printing Horizontal Line of Stars
                for (int j=1; j<=(rows * 2 -1); j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                // Printing space before Vertical Line of Stars
                for(int k=1; k<= rows-1; k++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
	}
	}

	public static void main(String[] args) {
		
		crossPattern();
		diamondPattern();
		

		
	}

}
