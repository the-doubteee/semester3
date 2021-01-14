package ankit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class stringBuilder {
	public static void main(String a[]) throws IOException
	{
		FileReader fr= new FileReader("input.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		StringBuilder stBuilder= new StringBuilder();
		
		String line = null;
		while ((line=br.readLine())!=null)
		{
			stBuilder.append(line);
			stBuilder.append("\n");
			
		}
		String contents = stBuilder.toString();
		System.out.println(contents);
		
		
		}
}
