package ankit;
import java.io.File;
public class Listing_dir {
public static void main(String[] args) {
		
		// try-catch block to handle exceptions 
        		try { 
  
            		// Create a file object 
            		File f = new File("C:\\Users\\Ankit Raj Biswal\\Documents"); 
  
            		// Get all the names of the files/Directory  
            		// present in the given directory 
            		File[] DirList = f.listFiles(); 
 
            		System.out.println("Files/Directories are in the given directory:"); 
  
            		// Display the names of the files/Directories 
            		for (int i = 0; i < DirList.length; i++) { 
                		System.out.println(DirList[i].getName()); 
            		}
            		
                   System.out.println();


            		// Get list of names from current directory	
            		File[] Dirs = new File(".").listFiles( );
                        
            		System.out.println("Files/Directories are in the given directory:"); 
            
            		// Display the names of the files/Directories 
            		for (int j = 0; j < Dirs.length; j++) { 
                			System.out.println(Dirs[j].getName()); 
            		} 
        		}
         
        		catch (Exception e) { 
        	
            		System.err.println(e.getMessage()); 
        		} 
	}
}


