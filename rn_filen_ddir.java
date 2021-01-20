package ankit;
import java.io.File;
public class rn_filen_ddir {
	public static void main(String[] args) {
		//File objects for the existing name
				File oldName =  new File("C:\\Users\\Ankit Raj Biswal\\eclipse-workspace\\MyFile.txt"); 
				
				//File objects for the new name
				File newName =  new File("C:\\Users\\Ankit Raj Biswal\\eclipse-workspace\\Ankit.txt"); 
				  
				//renameTo(): Renames the file denoted 
				//by this abstract pathname. If file is 
		        		//already exist it show Error message
				if (oldName.renameTo(newName))
					
				    System.out.println("Renamed successfully"); 
				
				else 
					
				    System.out.println("Error");   
			


// Rename the Directory
File oldName1 =  new File("H:\\DemoJava"); 

//File objects for the new name
File newName1 =  new File("H:\\Java");
  
if (oldName1.renameTo(newName1))
	
    System.out.println("Renamed successfully"); 

else 
	
    System.out.println("Error");   
      }

}




