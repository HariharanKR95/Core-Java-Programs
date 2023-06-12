package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_a_File_Example5 {

	public static void main(String[] args) throws FileNotFoundException 
	{
	
		File f=new File("C:\\Users\\pc\\Desktop\\Demo\\Sample3.txt");
		
		Scanner sc=new Scanner(f);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
	}

}
