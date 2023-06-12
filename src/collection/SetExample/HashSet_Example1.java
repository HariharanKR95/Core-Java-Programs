package collection.SetExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Example1 {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("Java");
		
		hs.add("Python");
		
		hs.add(null);
		
		hs.add("POM");
		
		hs.add("TestNG");
		
		hs.add("Java");
		
		hs.add(null);
		
		hs.add("TestNG");
		
		hs.add(null);
		
		hs.add("C");
		
		System.out.println(hs);
		
		System.out.println("=========for each========");
		
		for(String  hh : hs)
		{
			System.out.println(hh);
		}
		
		System.out.println("=========iterator========");
		
		Iterator<String> it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
