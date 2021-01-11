package ankit;

import java.util.*;

public class FormatD {
public static void main(String a[])
{
	Formatter fm = new Formatter();
	
	Object result = fm.format("%1$04d the year of %2$f", 51, Math.PI);
	System.out.println(result);
	
	
	Object stringResult = String.format("%04d - the year of %f", 1951, Math.PI);
	System.out.println(stringResult);
	
	System.out.printf("%04d - the year of %f%n", 1956, Math.PI);
	
	
    }
}
