package ankit;

//WAP to find the number of unique 
//digits present in a number.
import java.util.*;

class digit {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter a no.");
     int a = sc.nextInt();
     String s = String.valueOf(a);
     System.out.println(s);

     for (int i = 0; i < 10; i++) {
         if (s.contains(Integer.toString(i)))
             System.out.print(i + " ");
     }
 }
}
