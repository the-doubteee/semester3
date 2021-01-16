import java.io.*;

abstract class shape{
	public abstract double area();
}
class triangle extends shape{
	double a,b;
	triangle(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	public double area()
	{
		return 0.5*a*b;
	}
}
class circle extends shape{
	double a;
	circle(double a)
	{
		this.a=a;
	}
	public double area()
	{
		return Math.PI*a*a;
	}
}
class rectangle extends shape{
	double a,b;
	rectangle(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	public double area()
	{
		return a*b;
	}
}
public class oops_q4 {
static BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
     shape s;
     System.out.println("Inputs for rectangle :");
     s=new rectangle(Double.parseDouble(ob.readLine()),Double.parseDouble(ob.readLine()));
   System.out.println(s.area());
     System.out.println("Inputs for Circle");
     s=new circle(Double.parseDouble(ob.readLine()));
     System.out.println(s.area());
     System.out.println("Inputs for Triangle");
     s=new triangle(Double.parseDouble(ob.readLine()),Double.parseDouble(ob.readLine()));
	System.out.println(s.area());
	}

}
