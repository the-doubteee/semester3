package ankit;

	import java.io.File;

	public class FileAttributeChange {

		public static void main(String a[])
		{
			File f = new File("file1.txt");
			
			if(f.exists())
			{
				boolean res = f.setReadOnly();
				
				if(res)
					System.out.println("Setting read only succeeded.");
	else
					System.out.println("Setting read only failed");
			}
			else
				System.out.println("File does not exits.");
			
			if(f.canWrite())
			{
				System.out.println("But still writable");
				return;
			} else
				System.out.println("canWrite returned false correctly after setting the read only");
			
		}
	}
