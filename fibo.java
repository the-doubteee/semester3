package ankit;
/* WAP to display 20th no in fibonacci series */
//0,1,1,2,3,5,8,13,21
public class fibo {
 public static void main(String[] args) {
     System.out.println(fibb(20 - 1));
 }

 private static int fibb(int n) {
     if (n <= 1)
         return n;
     else
         return fibb(n - 1) + fibb(n - 2);
 }
}
