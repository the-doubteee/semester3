package ankit;
import java.util.Scanner;
public class reversestring {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        String res = "";

	        for (int i = 0; i < s.split(" ").length; i++) {
	            String c = s.split(" ")[i];
	            if (c.length() == 4) {

	                System.out.println(c);
	                res += (reverse(c) + " ");
	            } else
	                res += (c + " ");
	        }
	        System.out.println(res);

	    }

	    public static String reverse(String s) {

	        StringBuilder sb = new StringBuilder();

	        sb.append(s);
	        sb = sb.reverse();

	        return sb.toString();
	    }
	}


