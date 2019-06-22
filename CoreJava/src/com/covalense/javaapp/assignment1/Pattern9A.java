
public class Pattern9A {

	public static void main(String[] args) {

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

}
