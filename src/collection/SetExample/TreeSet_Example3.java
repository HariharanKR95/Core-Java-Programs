package collection.SetExample;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Example3 {

	public static void main(String[] args) 
	{
		TreeSet<String> ts= new TreeSet<String>();
		
		ts.add("Java");
		
		ts.add("Abstraction");
		
		ts.add("Selenium");
		
		ts.add("Python");
		
		ts.add("TestNG");
		
		ts.add("Polymorphism");
		
		ts.add("Java");
		
		ts.add("Selenium");
		
		ts.add("Encapsulation");
		
		ts.add("POM");
		
		System.out.println(ts);
		
		Iterator<String> it=ts.descendingIterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
