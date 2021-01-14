package ankit;

	import java.io.File;
	public class ListRoot {

		public static void main(String a[])
		{
			File[] drives = File.listRoots();
			for(File dir: drives)
				System.out.println(dir);
		}
		
	}

