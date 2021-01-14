package ankit;
	import java.io.File;
	public class TransientFile {

		public static void main(String[] a) {
			
			File f = null;
			try {
				f = File.createTempFile("tmp", ".txt");
				System.out.println("Find Path:"+ f.getAbsolutePath());
				
				f.deleteOnExit(); // deletes the file when JVM terminates
				
				f = File.createTempFile("tmp", null);
				System.out.println("File Path: "+ f.getAbsolutePath());
				f.deleteOnExit();
				}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
		

