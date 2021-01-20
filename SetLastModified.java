package ankit;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SetLastModified {
	public static void main(String args[]) { 
		
		 File f = null;
	      boolean bool = false;
	      int year, month, day;
	      long millisec;
	      Date dt;
	      
	      try {
	    	  	 // create new File object
	    	  	 f = new File("C:\\Users\\Ankit Raj Biswal\\Documents\\eclipse-workspace\\abc.txt");
	    	  	
	    	  	 //Get the file name
		         String FName = f.getName();
		         
		         System.out.println("*** Last Modification Time Before Setting ***"); 
	         
	         	// Report on the modification time.
			Date d = new Date(f.lastModified());
		      System.out.println(FName + " is Last Modified on " + d);
				
                System.out.println("*** Last Modification Time After Setting ***");
	         
				// date components
				year = 2020; 
				month = 04; 
				day = 10;
	         
				// date in string
				String sDate1 = day+"/"+month+"/"+year;
	         
               Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
					         
				// calculate milliseconds
				millisec = date1.getTime();
	         
	         		// Check if the last modified time 
				// can be set to new value 
				if (f.setLastModified(millisec)) { 
	
					// Display that the last modified time 
					// is set as the function returned true 
					System.out.println("Last modified time of "+ FName + " is set"); 
					
									
					// last modified time
		           		 millisec = f.lastModified();
		            
		           		 // calculate date object
		            		dt = new Date(millisec);
					
					// Print on the modification time.
					System.out.println(FName + " is (new) Last Modified on " + dt);
	
				} 
				else { 
	
	            	// Display that the last modified time 
	            	// cannot be set as the function returned false 
	            	System.out.println("Last modified time cannot be set"); 
	        	} 
	         
	      } catch(Exception e) {
	         // if any error occurs
	         e.printStackTrace();
	      }
	 }
}

