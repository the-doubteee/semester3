package ankit;
	import java.io.File;
	public class RName1 {

		public static void main(String a[])
		{
			File f = new File("input.txt");
			f.renameTo(new File("modifiedInput.dat"));
		}
		
	}
