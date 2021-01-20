package ankit;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
	   public static void main(String[] args) {
		   
		 //Converts a path string, or a sequence of strings  
		 	   	//that when joined form a path string, to a Path.
		 	   	Path path = Paths.get("C:\\Users\\Ankit Raj Biswal\\Documents\\eclipse-workspace\\abc.txt");
		 	   	System.out.println("Relative path: " + path);
		       
		 	   	//Returns a Path object representing 
		 	   	//the absolute path of this path.
		 	   	Path absolute = path.toAbsolutePath();
		 	   	System.out.println("Absolute path: " + absolute);
		       
		       
		 	   	//Returns a name element of this path as a Path object.
		 	   	System.out.println("Name: " + path.getFileName());
		       
		 	   	//Returns the root component
		 	   	System.out.println("Root: " + path.getRoot());
		       
		 	   	//Returns the parent path
		 	   	System.out.println("Parent: " + path.getParent());
		       
		 	   	//Returns the number of name elements in the path.
		 	   	System.out.println("Name Count: " + path.getNameCount());
		       
		 	   	//Returns a name element of this path as a Path object.
		 	   	System.out.println("First Directory: " + path.getName(0));
		       
		 	   	//Returns a relative Path that is a subsequence 
		 	   	//of the name elements of this path.
		 	   	System.out.println("Sub Path: " + path.subpath(0, 2));
		       
		 	   	//Returns the string representation of this path. 
		 	   	System.out.println(path.toString());
		             
		 	   	// call toFile() to get 
		 	   	// File object from path 
		 	   	File file = path.toFile(); 

		 	   	// print file details 
		 	   	System.out.println("File Name:" + file.getName()); 
		      
		 	   	if (!file.exists()) {
		 	   		System.out.println("This is a path.");
		 	   	} else {
		     			System.out.println("This is a file.");
		     		}
		       
		       
		 	   	//Get the path of file.
		 	   	System.out.println("Path: " + file.toPath());
		      	}
		 }


