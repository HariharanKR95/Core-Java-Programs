package FileHandling;

import java.io.File;
import java.io.IOException;

public class Create_a_file_Example1 
{
	
	public static void main(String[] args) throws IOException 
	{
		File  f=new File("C:\\Users\\pc\\Desktop\\Demo\\Sample2.txt");
		
		if(f.exists())
		{
			System.out.println("File already exists");
		}
		
		else
		{
			f.createNewFile();
			System.out.println("File was created successfully");
			
		}
		
	}

}
