package ankit;
import java.io.File;
public class dlt_file {
	public static void main(String[] args) {
		
		//File objects for the new name
		File file =  new File("H:\\DemoJava\\JAVA.txt"); 
				  
		//file.delete(): Deletes the file or 
		//directory denoted by this abstract path name. If 
		//no such file display the failed to delete message
		if(file.delete()) 
		{ 
		    System.out.println("File deleted successfully"); 
		} 
		else
		{ 
		    System.out.println("Failed to delete the file"); 
		}  
	}
}



