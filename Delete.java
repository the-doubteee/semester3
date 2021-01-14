package ankit;
	import java.io.File;
	import java.io.IOException;
	public class Delete {

		public static void main(String a[]) throws IOException
		{
			File f = new File("modifiedInput.dat");
			f.delete();
		}
}
