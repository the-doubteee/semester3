package ankit;
import java.io.File;
public class SetReadOnly {
public static void main(String[] args) {
		
		try {
			
			 System.out.println("*** Before File Setting ***");
			 
			 //Creates a new File instance
	         File file = new File("C:\\Users\\Ankit Raj Biswal\\Documents\\eclipse-workspace\\FileOperation.txt");
	         
	         //Atomically creates a new, empty file 
	         file.createNewFile();
	          
	         //Get the file name
	         String f = file.getName();
	          
	         if (file.canRead())
	        	 
	            System.out.println(f + " is Readable");
	         
	         else
	        	 
	            System.out.println(f + " is Not Readable");
	         
	         if (file.canWrite())
	        	 
	            System.out.println(f + " is Writable");
	         
	         else
	        	 
	            System.out.println(f + " is Not Writable");
	         
	            file.setReadOnly();
	            
	         System.out.println("");
	          
	         System.out.println("*** After File Setting ***");
	         
	         if (file.canRead())
	        	 
	            System.out.println(f + " is Readable");
	         
	         else
	        	 
	            System.out.println(f + " is Not Readable");
	         
	         if (file.canWrite())
	        	 
	            System.out.println(f + " is Writable");
	         
	         else
	        	 
	            System.out.println(f + " is Not Writable");
	         
	      } catch(Exception e) {
	    	  
	         e.printStackTrace();
	         
	      }
	}
}

