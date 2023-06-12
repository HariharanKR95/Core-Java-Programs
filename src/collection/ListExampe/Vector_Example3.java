package collection.ListExampe;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Example3 {

	public static void main(String[] args) 
	{
		Vector<String> v=new Vector<String>();
		
		v.add("Java");
		
		v.add(null);
		
		v.add("TestNG");
		
		v.add("Java");
		
		v.add("Selenium");
		
		v.add(null);
		
		v.add("Java");
		
		v.add("TestNG");
		
		v.add("POM");
		
		v.add(null);
		
		System.out.println(v);
		
		System.out.println("==========for loop==========");
		
		
		System.out.println("==========for each==========");
		
		
		System.out.println("==========iterator==========");
		
		
		System.out.println("==========list iterator==========");
		
		
		System.out.println("==========enumeration==========");
		
		Enumeration<String> s=v.elements();
		
		while(s.hasMoreElements())
		{
			System.out.println(s.nextElement());
		}

	}

}
