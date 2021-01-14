package ankit;
	import java.io.File;
	import java.io.IOException;
	import java.util.Date;

	public class FileStatus1 {

		public static void main(String a[]) throws IOException
		{
			status("input.txt");
		}
		public static void status(String fName) throws IOException
		{
			System.out.println("File is "+ fName);
			
			File f = new File(fName);
			// name of the file
			System.out.println("File Name: "+ f.getName());
			
			if(!f.exists())
			{
				System.out.println("File not found");
			return;
			}
	// full path name
			System.out.println("Full name: " + f.getCanonicalPath());
			
			// Parent directory
			String p = f.getParent();
			if(p!=null)
				System.out.println("Parent directory "+ p);
			
			if(f.canRead())
				System.out.println("File is readable.");
			
			if(f.canWrite())
				System.out.println("File is writable");
			
			Date d = new Date(f.lastModified());
			System.out.println("Last Modified: "+ d);
			
			if(f.isFile()) {
				System.out.println("File size: " + f.length()+ "bytes");
				
			} 
	else if (f.isDirectory()) {
				System.out.println("It's a directory");
			} else
				System.out.println("Niether a file nor a directory");
				
				
		}
		
	}

