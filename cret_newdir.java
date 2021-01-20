package ankit;
import java.io.File;
public class cret_newdir {
	public static void main(String[] args) {
		
	     //Creating a File object
	      File file = new File("C:\\Users\\Ankit Raj Biswal\\eclipse-workspace\\MyFile.txt");

	      //Creating the directory
	      boolean bool = file.mkdirs();

	      if(bool){

	        	        System.out.println("Directory created successfully");
	      }
	      else{
	                 System.out.println("Sorry couldnt create specified 												directory");
	      }
	}
}


