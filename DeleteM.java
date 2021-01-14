package ankit;
import java.io.File;
public class DeleteM {

	public static void main(String[] arg)
	{
		for(String file: arg)
			delete(file);
	}
	public static void delete(String fName) {
		try {
			File target = new File(fName);
			if(!target.exists())
			{
				System.err.println("File "+fName + "is not present");
				return;
			}
if(target.delete())
			{
				System.out.println("File is deleted "+ fName);
			}else
				System.err.println("Failed to delete.");
		}
		catch(SecurityException e) {
			System.err.println("Unable to delete "+ fName + "exception message" + e.getMessage());
		}
			
		
	}
}