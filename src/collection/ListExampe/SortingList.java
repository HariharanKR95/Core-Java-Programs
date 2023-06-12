package collection.ListExampe;

import java.util.ArrayList;
import java.util.Collections;

public class SortingList {

	public static void main(String[] args) {
	
		ArrayList<String> al=new ArrayList<String>();
		
		
		al.add("Java");
		
		al.add("Selenium");
		
		al.add("Abstract");
		
		al.add("Java");
		
		al.add("Polymorphism");
		
		al.add("TestNG");
		
		al.add("DDF");
		
		al.add("POM");
		
		al.add("Encapsulation");
		
		//al.add(null);
		
		al.add("Java");
		
		al.add("DDF");
		
		al.add("Cucumber");
		
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		Collections.sort(al);
		
		Collections.reverse(al);
		
		System.out.println(al);
		
		

	}

}
