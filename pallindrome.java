package ankit;

import java.util.Scanner;

//Write a program to nd a palindromic number. A palindromic number is a number if the sum of the number and reverse of that number is palindrome number.Example: input 72 rev 27 sum 99 is a palindrome. input 142 rev 241 sum 383 palindrome
//Note: your program take any number and nd its palindromic number.
public class pallindrome {
 public static void main(String args[]) {
     int r, sum = 0, sum1 = 0, temp, temp1, temp2;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number you like");
     int n = sc.nextInt();
     temp = n;
     // Reversing the number
     while (n > 0) {
         r = n % 10;
         sum = (sum * 10) + r;
         n = n / 10;
     }
     if (temp != sum) {
         System.out.println("The reverse is = " + sum);
         temp1 = sum + temp;
         temp2 = temp1;
         while (temp1 > 0) {
             r = temp1 % 10;
             sum1 = (sum1 * 10) + r;
             temp1 = temp1 / 10;
         }
         if (temp2 == sum1) {
             System.out.println("Its Pallindromic number = " + sum1);

         } else
             System.out.println("Its not a pallindromic number");
     }

     else {
         System.out.println("Its sum is not palindrome no.");
     }
 }
}