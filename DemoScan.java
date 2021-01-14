package ankit;
import java.util.*;
public class DemoScan {

	public static void main(String a[])
	{
		String sampleDate = "12  January 2021";
		Scanner in = new Scanner(sampleDate); // System.in
		
		int day = in.nextInt();
		String month = in.next();
		int year = in.nextInt();
		
		System.out.printf("%d  %s   %02d\n", day, month, year);
	}
	
}