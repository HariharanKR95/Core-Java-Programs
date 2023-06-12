package dailytasks;

import java.util.Scanner;

public class Scannertask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj = new Scanner(System.in);
		
		 String orginalstr;
		 String revstr="";
		 
		 System.out.println("Enter Orginal String:"); 
		 orginalstr = myObj.nextLine();   
		       
		    System.out.println("Orginal String is: " + orginalstr);    

		    for(int i=0;i<orginalstr.length();i++)
			{
				revstr=orginalstr.charAt(i)+revstr;
				
				
			}
		    System.out.println("reverse string:"+revstr);
	}

}
