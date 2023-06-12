package dailytasks;

import java.util.Scanner;

public class Task_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		 String str;
		 
		 System.out.println("Enter String:");
		 str=obj.nextLine();

		 System.out.println(str.replaceAll("[aieou]", ""));
	    }    

	
	}




