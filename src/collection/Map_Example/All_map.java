package collection.Map_Example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class All_map {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1, "Java");
		
		hm.put(2, null);
		
		hm.put(3, "Python");
		
		hm.put(7, "C");
		
		hm.put(4, null);
		
		hm.put(8, "Java");
		
		hm.put(null, "C++");
		
		hm.put(5, "Java Script");
		
		hm.put(10, null);
		
		hm.put(9, "C");
		
		hm.put(null, null);
		
		hm.put(null, "R");
		
		hm.put(12, "Perl");
		
		hm.put(1, "Selenium");
		
		hm.put(5, null);
		
		hm.put(11, "Python");
		
		hm.put(6, "Java");
		
		System.out.println(hm);
		
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		
		lhm.put(1, "Java");
		
		lhm.put(2, null);
		
		lhm.put(3, "Python");
		
		lhm.put(7, "C");
		
		lhm.put(4, null);
		
		lhm.put(8, "Java");
		
		lhm.put(null, "C++");
		
		lhm.put(5, "Java Script");
		
		lhm.put(10, null);
		
		lhm.put(9, "C");
		
		lhm.put(null, null);
		
		lhm.put(null, "R");
		
		lhm.put(12, "Perl");
		
		lhm.put(1, "Selenium");
		
		lhm.put(5, null);
		
		lhm.put(11, "Python");
		
		lhm.put(6, "Java");
		
		System.out.println(lhm);
		
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		

		
		tm.put(1, "Java");
		
		tm.put(2, null);
		
		tm.put(3, "Python");
		
		tm.put(7, "C");
		
		tm.put(4, null);
		
		tm.put(8, "Java");
		
		tm.put(9, "C++");
		
		tm.put(5, "Java Script");
		
		tm.put(10, null);
		
		tm.put(9, "C");
		
		tm.put(14, null);
		
		tm.put(11, "R");
		
		tm.put(12, "Perl");
		
		tm.put(1, "Selenium");
		
		tm.put(5, null);
		
		tm.put(11, "Python");
		
		tm.put(6, "Java");
		
		System.out.println(tm);
		
		
		
		

	}

}
