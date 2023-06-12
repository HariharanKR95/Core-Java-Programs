package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Append_a_File_Example3 {
	
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\pc\\Desktop\\Demo\\Sample1.txt");
		
		FileWriter fw=new FileWriter(f);
		
		fw.append(" and i am learning selenium automation");
		
		System.out.println("File append successfully");
		
		fw.close();
	}

}
