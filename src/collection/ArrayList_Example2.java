package collection;

import java.util.ArrayList;

public class ArrayList_Example2 {
	
	//add, addall, clone, clear, isEmpty, remove, removeall, contains, 
	
	//containsall, equals, iterator, listiterator

	public static void main(String[] args) {
		
		ArrayList<Double> al=new ArrayList<Double>();
		
		al.add(34.5);
		
		al.add(45.3);
		
		al.add(23.5);
		
		System.out.println(al);
		
		al.add(75.5);
		
		System.out.println(al);
		
		al.add(2, 55.5);
		
		System.out.println(al);
		
		al.remove(45.3);
		
		System.out.println("1st List = "+ al);
		
		
		ArrayList<Double>al2=new ArrayList<Double>();
		
		al2.add(115.5);
		
		al2.add(125.5);
		
		al2.add(160.5);
		
		System.out.println("List 2 = " + al2);
		
		
		al.addAll(al2);
		
		System.out.println("1st list =" +al);
		
		Object al3=al.clone();
		
		System.out.println(al3);
		
		al2.clear();
		
		System.out.println(al2);
		
	    System.out.println(al.contains(55.5));
	    
	    System.out.println(al.indexOf(55.5));
	    
	    System.out.println(al.isEmpty());
	    
	    System.out.println(al2.isEmpty());
	    
	    System.out.println(al);
	    
	    al.add(5,55.5);
	    
	    System.out.println(al);
	    
	   System.out.println(al.lastIndexOf(55.5));
	   
	   System.out.println(al.size());
	   
	   System.out.println(al.get(4));
		
	}

}
