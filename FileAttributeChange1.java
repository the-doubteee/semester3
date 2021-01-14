package ankit;

	import java.io.File;
	import java.text.SimpleDateFormat;
	public class FileAttributeChange1 {

		public static void main(String a[])
		{
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			
			File f = new File("file1.txt");
			if(f.exists()) {
				System.out.println("Befor: "+ sdf.format(f.lastModified()));
				
				long t = 2000000000;
				boolean res = f.setLastModified(t);
	if(res)
				{
					System.out.println("After: "+ sdf.format(f.lastModified()));
				}
				else
					System.err.println("Modification of the last accessed time is failed");
			}
			else
				System.err.println("File does not exits");
		}
	}

