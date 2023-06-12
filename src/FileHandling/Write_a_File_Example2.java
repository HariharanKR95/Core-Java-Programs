package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_a_File_Example2 {

	public static void main(String[] args) throws IOException 
	{
		
		File f=new File("C:\\Users\\pc\\Desktop\\Demo\\Sample1.txt");
		
		FileWriter fw=new FileWriter(f);
		
		fw.write("I am learning java programming");
		
		System.out.println("File written successfully");
		
		fw.append(" and i am learning selenium automation");
		
		System.out.println("File append successfully");
		
		fw.close();
		
	}

}
