package collection.Map_Example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Iterating_Map {

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
		
		Set<Entry<Integer,String>> s = hm.entrySet();
		
		Iterator<Entry<Integer,String>> it=s.iterator();
		
		while(it.hasNext())
		{
			Map.Entry<Integer, String>	me=(Map.Entry<Integer,String>)it.next();
			
			System.out.println(me.getKey()+"====>"+me.getValue());
		}
		
		
		

	}

}
