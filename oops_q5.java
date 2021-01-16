import java.util.*;
class MutableInteger{

int a;
   void set(int a)
   {
	   this.a=a;
   }
   void get()
   {
	   System.out.println(a);
   }
   void incr(int i)
   {
	   a+=i;
   }
}
public class oops_q5 {
static Scanner ob=new Scanner(System.in);
	public static void main(String[] args){
		// TODO Auto-generated method stub
       MutableInteger i=new MutableInteger();
       int ans=0;
	   do
	   {
		   System.out.println("Enter 1. to set integer\n   2.to get integer\n   3.to increment the integer");
		   int ch=ob.nextInt();
		   switch(ch)
		   {
		   case 1:
			   System.out.println("Enter the number u want to set");
			   i.set(ob.nextInt());
		   break;
		   case 2:i.get();
		   break;
		   case 3:
			   System.out.println("Enter the number by which u want to increment ");
			   i.incr(ob.nextInt());
		   break;
		   default:
			   System.out.println("Wrong choice");
		   }
		   System.out.println("Do u want to continue (1/0)?");
		   ans=ob.nextInt();
	   }while(ans==1);
	}

}
