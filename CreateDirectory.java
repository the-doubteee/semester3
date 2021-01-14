package ankit;
	import java.io.File;
	public class CreateDirectory {
		public static void main(String a[])
		{
			File f = new File("/home/ankit/newjava"); // "C:\"
			
			if(!f.exists())
			{
				if(f.mkdir())
					System.out.println("Directory is created.");
				else
					System.out.println("Directory creation is failed");
				
			}
			
			File fs = new File("home/ankit/once/twice/again"); // "D:\"
			if(!fs.exists())
			{
				if(fs.mkdirs())
					System.out.println("All the directories are created");
				else
	System.out.println("Directories creation failed");
				
			}
			else
				System.out.println("Directories are already there.");
		}
		
		
	}

