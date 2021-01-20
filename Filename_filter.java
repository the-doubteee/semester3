package ankit;
import java.io.File;
public class Filename_filter {
public static void main(String[] args) {
		
		// try-catch block to handle exceptions 
        		try { 
  
            		// Create a file object 
            		File f = new File("C:\\Users\\Ankit Raj Biswal\\Documents\\JavaDemo"); 
  
           		 // Get all the names of the files 
            		// present in the given directory 
           
            		// Create a FilenameFilter 
            		FilenameFilter filter = new FilenameFilter() { 
  
                			public boolean accept(File f, String name) { 
                    			return name.startsWith("out"); 
                			} 
            		}; 
 
            		// Get all the names of the directory 
    			// present in the given directory 
    			// and whose names start with "out" 
            		File[] DirList = f.listFiles();
            

           System.out.println("Files/Directories are in the given directory:"); 
  
            		// Display the names of the files/Directories 
            		for (int i = 0; i < DirList.length; i++) { 
                			System.out.println(DirList[i].getName()); 
            		}
           
        		}
         
        		catch (Exception e) { 
        	
            		System.err.println(e.getMessage()); 
        		} 
	}
}


