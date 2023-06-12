package collection.ArrayListExampe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Example1 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		
		al.add("Java");
		
		al.add("Selenium");
		
		al.add(null);
		
		al.add("Java");
		
		al.add(null);
		
		al.add("TestNG");
		
		al.add("DDF");
		
		al.add("POM");
		
		al.add(null);
		
		al.add("Java");
		
		al.add("DDF");
		
		al.add("Cucumber");
		
		
		System.out.println(al);
		
		System.out.println("=========for loop=======");
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("=========for each========");
		
		for(String aa : al)
		{
			System.out.println(aa);
		}
		
		System.out.println("======iterator======");
		
		Iterator<String> it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("=======List iterator=====");
		
		ListIterator<String> lit=al.listIterator();
		
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
		System.out.println("========list iterator reverse======");
		
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}

	}

}
