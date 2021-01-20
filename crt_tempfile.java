package ankit;
import java.io.File;
public class crt_tempfile {
public static void main(String[] args) {
		
		File f = null;
        
	      try {
	    	  
	    	  System.out.println("*** Create Temporary file using First Syntax ***");
	    	  
	    	  // creates temporary file
	          f = File.createTempFile("tmp", ".txt");
	          

	          // prints absolute path
	          System.out.println("File path: "+f.getAbsolutePath());
	          
	          // deletes file when the virtual machine terminate
		      f.deleteOnExit();
	          
	          // creates temporary file
	          f = File.createTempFile("tmp", null);
	          
	          // prints absolute path
	          System.out.println("File path: "+f.getAbsolutePath());
	          
	          // deletes file when the virtual machine terminate
		      f.deleteOnExit();
	    	  
		      System.out.println(" ");
		      
		      System.out.println("*** Create Temporary file using Second Syntax ***");
		      
	         // creates temporary file
	         f = File.createTempFile("tmp", ".txt", new File("D:/"));
	         
	         // prints absolute path
	         System.out.println("File path: "+f.getAbsolutePath());
	         
	         // deletes file when the virtual machine terminate
	         f.deleteOnExit();
	         
	         // creates temporary file
	         f = File.createTempFile("tmp", null, new File("D:/"));
	         
	         // prints absolute path
	         System.out.print("File path: "+f.getAbsolutePath());
	         
	         // deletes file when the virtual machine terminate
	         f.deleteOnExit();
	         
	      } catch(Exception e) {
	         // if any error occurs
	         e.printStackTrace();
	      }
	}
}


