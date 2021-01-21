/*     Question 1. Write a program in Java to display the following pattern
                             *
                             * *
                             * * *
                             * * * *
                             * * * * *
                             * * * * * *
                             * * * * *
                             * * * *
                             * * *
                             * *
                             *
*/
package ankit;
import java.util.Scanner;
public class Q1_Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner an = new Scanner(System.in);
		        System.out.println("Enter the number of rows you need: ");
		        int r = an.nextInt();        
		        for (int i= 0; i<= r-1 ; i++)
		        {
		            for (int j=0; j<=i; j++) 
		              {
		            	System.out.print("*"+ " ");
		               }
		            System.out.println("");
		        } 
		        for (int i=r-1; i>=0; i--)
		        {
		            for(int j=0; j <= i-1;j++)
		               {
		                System.out.print("*"+ " ");
		               }
		            System.out.println("");
		        }
		        an.close();
		    }
		}

//Ankit Raj Biswal
//1941012238 CSE D
