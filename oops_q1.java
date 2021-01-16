class student{
	String name;
	int r,a;
	student(String name,int r,int a)
	{
		this.a=a;
		this.name=name;
		this.r=r;
	}
	@Override
	public String toString()
	{
	  return name+"\n"+r+"\n"+a;	
	}
}
public class oops_q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        student s=new student("Ankit",23,20);
        System.out.println(s);
	}

}
