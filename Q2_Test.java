
//Question 2. Write a program in Java to check whether a number is palindrome or not.
package ankit;
import java.util.*;
public class Q2_Test {
		  public static void main(String[] args) {
	          Scanner an= new Scanner(System.in);
	          
	          // First we will take the input of the number whose pallindromity we have to check
	          
	          System.out.println("Enter the number you want check");
		        int num =an.nextInt();
		        int revNum = 0, remainder, orgNum;

		        orgNum = num;

		        // reversed integer is stored in variable 
		        while( num != 0 )
		        {
		            remainder = num % 10;
		            revNum = revNum * 10 + remainder;
		            num  /= 10;
		        }

		        // pallindrome if orignalInteger and reversedInteger are equal
		        if (orgNum == revNum)
		            System.out.println(orgNum + " is a palindrome.");
		        else
		            System.out.println(orgNum + " is not a palindrome.");
		    }
	}

	//Ankit Raj Biswal
	// 1941012238 CSE D
