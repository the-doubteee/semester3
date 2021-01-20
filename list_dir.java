package ankit;
import java.io.File;
public class list_dir {
public static void main(String[] args) {
		
		// try-catch block to handle exceptions 
        		try { 
  
            		// Create a file object 
            		File f = new File("C:\\Users\\Ankit Raj Biswal\\Documents"); 
  
            		// Get all the names of the files/Directory  
            		// present in the given directory 
            		String[] DirList = f.list(); 
  
            		System.out.println("Files/Directories are in the given directory:"); 
  
           		 // Display the names of the files 
            		for (String dir : DirList) {
            			System.out.println(dir);
            		}	
            
            		System.out.println();

            		// Get list of names from current directory	
            		String[] Dirs = new java.io.File(".").list(); 
                        
            		System.out.println("Files/Directories are in the current directory:"); 
            
            		// Display the names of the files 
            		for (String dirname : Dirs) {
            			System.out.println(dirname);
            		} 
        		} 
        		catch (Exception e) { 
        	
            		System.err.println(e.getMessage()); 
        		} 
	}
}

