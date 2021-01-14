package ankit;
	import java.util.Arrays;
	import java.io.*;
	public class ListDir {
		public static void main(String a[])
		{
			String[] dirs = new File(".").list();
			Arrays.sort(dirs);
			for(String dir: dirs)
				System.out.println(dir);
		}
	}

