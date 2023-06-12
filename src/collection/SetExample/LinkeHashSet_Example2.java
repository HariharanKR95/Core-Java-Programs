package collection.SetExample;

import java.util.LinkedHashSet;

public class LinkeHashSet_Example2 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		
		lhs.add("Java");
		
		lhs.add(null);
		
		lhs.add("Selenium");
		
		lhs.add("Python");
		
		lhs.add("TestNG");
		
		lhs.add(null);
		
		lhs.add("Java");
		
		lhs.add("Selenium");
		
		lhs.add(null);
		
		lhs.add("POM");
		
		System.out.println(lhs);
		
		
		

	}

}
