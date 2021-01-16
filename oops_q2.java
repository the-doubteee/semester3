import java.util.*;
class student1{
	String name;
	int r,a;
	student1(String name,int r,int a)
	{
		this.a=a;
		this.name=name;
		this.r=r;
	}
	@Override
	public boolean equals(Object s)
	{
	
		if(s==this)
			return true;
		if(s==null)
			return false;
		if(s.getClass()!=this.getClass())
			return false;
		student1 s1=(student1)s;
		if(this.name.equals(s1.name)&&this.a==s1.a&&this.r==s1.r)
			return true;
		if(s.equals(null))
			return false;
	
		
return false;
			
	}
	
}
public class oops_q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       student1  s=new student1("s",12,23);
       student1 s1=new student1("s",12,23);
       if(s1.equals(s1))
       System.out.println("Reflexive nature :"+s1.equals(s1));
       if(s1.equals(s)&&s.equals(s1))
    	   System.out.println("Symmetrical Nature :"+(s1.equals(s)&&s.equals(s1)));
       else
    	   System.out.println("Not symmetric");
       student1 s2=new student1("s",12,23);
       if(s.equals(s1)&&s1.equals(s2)==s2.equals(s))
    	   System.out.println("transitive nature :"+(s.equals(s1)&&s1.equals(s2)==s2.equals(s)));
       else
    	   System.out.println("not transitive");
       if(!s.equals(null))
    	   System.out.println("It is cautious :"+!s.equals(null));
       System.out.println("For showing the repetable nature :"+s1.equals(s));
	}

}
