import java.util.*;
import java.util.regex.*;


class car{
	String ch_no;
	String color;
	double maxs;
	car(String ch_no,String color,double maxs)
	{
		this.ch_no=ch_no;
		this.color=color;
		this.maxs=maxs;
	}
	
}
class chassisnumber extends Exception
{
	chassisnumber()
	{
		super();
	}
	void createexception(car c)
	{
		Pattern p=Pattern.compile(".*[a-zA-Z0-9]+.*");
		Matcher m=p.matcher(c.ch_no);
		int pos=-1;
		if(m.matches())
			pos=0;
		else
			pos=-1;
		
		if(pos==-1)
			throw new NumberFormatException("Invalid");
		else if(c.ch_no.equals("10"))
			throw new NumberFormatException("Invalid");
		else
			System.out.println("Valid");
	}
}
public class oops_q3 {
static Scanner ob=new Scanner(System.in);
   
   public static void main(String []a)
   {
	   System.out.println("Enter chasis number, color and maxspeed :");
	   car c=new car(ob.next(),ob.next(),ob.nextInt());
	   chassisnumber cn=new chassisnumber();
	   cn.createexception(c);
	   
   }
}
