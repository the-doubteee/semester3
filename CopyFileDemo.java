package ankit;
import java.io.*;
public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		FileReader in = null;
		FileWriter out = null;
		in=new FileReader("C:\\Users\\Ankit Raj Biswal\\eclipse-workspace\\ankit\\src\\ankit-rambo.txt");
		out=new FileWriter("ankit-rambo.txt");
		
		int c;
		while((c=in.read())!=-1)
		{
			out.write(c);
		}
		in.close();
		out.close();

	}

}
