package FileHandling;

import java.io.File;

public class Delete_a_File_Example4 {

	public static void main(String[] args) {
		
		File f=new File("C:\\Users\\pc\\Desktop\\Demo\\Sample2.txt");
		
		if(f.exists())
		{
			f.delete();
			
			System.out.println("File was deleted");
		}
		
		else
		{
			System.out.println("Given file name is wrong");
		}

	}

}
