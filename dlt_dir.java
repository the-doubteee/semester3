package ankit;
import java.io.File;
public class dlt_dir {
public static void main(String[] args) {
		
		//File objects for the existing Directory name
		File DirName = new File("H:\\DemoJava");
		
		//Function for directory deletion
		deleteDir(DirName);
		
		System.out.println("The directory is deleted.");
}
	
	public static boolean deleteDir(File dir){
		
		//Returns an array of abstract pathnames 
		//denoting the files in the directory 
		//denoted by this abstract pathname. 
	    File[] files = dir.listFiles();
	    
	    if(files != null){
	    	
	        for(File fileName : files){
	        	
	            if(fileName.isDirectory()){
	            	
	                deleteDir(fileName);
	                
	            } else {
	            	
	            	fileName.delete();
	                System.err.println("** Deleted " + fileName + " **");
	            }
	        }
	    }
	    return dir.delete();
	}
}
	
