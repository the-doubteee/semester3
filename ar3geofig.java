package ankit;
//Write a program to calculate the area of three geometrical figures using dynamic polymorphism
// or dynamic method dispatch
public class ar3geofig {
double a,b;

   ar3geofig(double i,double j)
   {
	   a=i;
	   b=j;
   }
   double area()
   {
	   System.out.println("Area of Figure is Undefined");
	   return 0;
   }
   
}

class Rectangle extends ar3geofig
{   
    Rectangle(double a,double b)
    {
        super(a,b);
    }
   
    //override area for Rectangle
    double area()
    {
        System.out.println("Inside Area Of Rectangle");
        return a*b;
    }
}

class Triangle extends ar3geofig
{   
    Triangle(double a,double b)
    {
        super(a,b);
    }
   
    //override area for Triangle
    double area()
    {
        System.out.println("Inside Area Of Triangle");
        return a*b*0.5;
    }
}

/*class circle extends ar3geofig
{   
    Rectangle(double a,double b)
    {
        super(a,b);
    }
   
    //override area for Rectangle
    double area()
    {
        System.out.println("Inside Area Of Rectangle");
        return a*b;
    }
}*/

class dynamic_method_dispatch
{
    public static void main(String args[])
    {   
          ar3geofig f = new ar3geofig(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
       
        ar3geofig figref;
       
        figref = r;
        System.out.println("Area ="+figref.area());
       
        figref = t;
        System.out.println("Area ="+figref.area());
       
        figref = f;
        System.out.println("Area ="+figref.area());
    }
}
