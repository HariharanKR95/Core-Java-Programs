package collection.SetExample;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertListtoSet {

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
		
		HashSet<String> hs=new HashSet<String>(al);
		
		System.out.println(hs);
		
		

	}

}
