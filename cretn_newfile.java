package ankit;
import java.io.File;
import java.io.IOException;

public class cretn_newfile {
	public static void main(String[] argv) throws IOException {
    try {  
		   //creating a Java File instance
	            File file = new File("C:\\Users\\Ankit Raj Biswal\\eclipse-workspace\\MyFile.txt"); 
	            
	            //createNewFile(): Atomically creates  
	            //a new, empty file. If file is already 
	            //exist it show file exist message
	            if (file.createNewFile()) {  
	            	
	                		System.out.println("New File is created!");  
	                
	            } else {  
	            	
	               		 System.out.println("File already exists."); 
	                
	            }
    } catch (IOException e) {  
    	
    	e.printStackTrace();  
   }  
 }
}