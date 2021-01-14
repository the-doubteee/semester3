package ankit;

import java.io.IOException;
import java.io.PrintStream;

public class Printstream {
	public static void main(String a[]) throws IOException
	{
		System.out.println("January");
		System.out.println("February");
		
		PrintStream ps = new PrintStream("error.log");
		System.setOut(ps);
		
		System.out.println("March");
		System.out.println("April");
		System.setErr(ps);
		
		int[] aa = new int [5];
		aa[10] = 10;
		ps.close();
		
	}
}
