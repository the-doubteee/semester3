package ankit;
import java.io.File;
import java.io.IOException;
import java.util.Date;


public class prptfile_dir {
public static void main(String[] argv) throws IOException {
		
		File f=new File("C:\\Users\\Ankit Raj Biswal\\eclipse-workspace\\MyFile.txt"); 
		
		// Print File name
		String n = f.getName();
		System.out.println("File Name: " + n);
		
	// Print full name
	System.out.println("Canonical Name: " + f.getCanonicalPath());
			
		// Print parent directory if possible
		String p = f.getParent();
		if (p != null) {
			System.out.println("Parent Directory: " + p);
		}
				
		// Check if the file is readable
		if (f.canRead()) {
			System.out.println("File is Readable.");
		}
				
		// Check if the file is writable
		if (f.canWrite()) {
			System.out.println("File is Writable.");
		}
		// Report on the modification time.
				Date d = new Date(f.lastModified());
				System.out.println("Last Modified " + d);
						
				// See if file, directory, or other. If file, print size.
				if (f.isFile()) {
						
					// Report on the file's size
				System.out.println("File size is " + f.length() + " bytes.");
							
				} else if (f.isDirectory()) {
							
					System.out.println("It's a Directory");
							
				} else {
							
				System.out.println("It's Neither a File nor a Directory!");
					
				}
			}
}
