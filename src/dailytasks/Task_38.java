package dailytasks;

import java.util.Scanner;

public class Task_38 {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		
		String str;
		String revstr="";
		
		System.out.println("original string");
		str=obj.nextLine();
		
		System.out.println("original string:"+str);
		
		for(int i=0;i<str.length();i++)
		{
			revstr=str.charAt(i)+revstr;
			
		}
		System.out.println("reversed string is:"+revstr);
		

	}

}
