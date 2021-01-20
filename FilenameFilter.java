package ankit;
import java.io.File;

public class FilenameFilter {
public static void main(String[] args) {
		
		// try-catch block to handle exceptions 
        		try { 
  
            		// Create a file object 
            		File f = new File("C:\\Users\\Sangram\\Documents"); 
  
         		// Create a FilenameFilter 
            		FilenameFilter filter = new FilenameFilter() { 
  
                			public boolean accept(File f, String name) {
 
                    			return name.startsWith("My"); 
                			} 
           		}; 
            
            		// Get all the names of the directory 
            		// present in the given directory 
            		// and whose names start with "My" 
            		String[] DirList = f.list(); 
  
            		System.out.println("Files/Directories are in the given directory:"); 
  
           		 // Display the names of the files 
            		for (String dir : DirList) {
            			System.out.println(dir);
            		}	
             	} 
        		catch (Exception e) { 
        	            		System.err.println(e.getMessage()); 
        		} 
	}
}

