package ankit;
	import java.util.Scanner;

	public class BitInversion {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        int n = sc.nextInt();
	        while (n-- > 0) {
	            int x = sc.nextInt();
	            s = changeBitAt(s, x);
	            System.out.print(count(s) + " ");
	        }
	        sc.close();
	    }

	    static int count(String s) {
	        int max = 1;
	        String c = s;
	        String a[] = new String[s.length()];
	        for (int i = 0; c.length() > 0; i++) {
	            String ch = c.charAt(0) == '0' ? "1" : "0";
	            if (c.contains(ch)) {
	                a[i] = c.substring(0, c.indexOf(ch));
	                c = c.substring(c.indexOf(ch), c.length()); // split(c.indexOf(ch))[1]
	            } else {
	                a[i] = c;
	                c = "";
	            }
	            if (max <= a[i].length())
	                max = a[i].length();
	        }
	        return max;
	    }

	    static String changeBitAt(String s, int x) {
	        String res1 = s.substring(0, x - 1);
	        String res2 = s.substring(x, s.length());
	        String res3;
	        if (s.charAt(x - 1) == '0')
	            res3 = res1 + '1' + res2;
	        else
	            res3 = res1 + '0' + res2;
	        return res3;
	    }
	}


