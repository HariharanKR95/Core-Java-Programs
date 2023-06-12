package collection.ListExampe;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Example2 {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll =new LinkedList<Integer>();
		
		ll.add(10);
		
		ll.add(35);
		
		ll.add(null);
		
		ll.add(5);
		
		ll.add(null);
		
		ll.add(25);
		
		ll.add(10);
		
		ll.add(35);
		
		ll.add(null);
		
		ll.add(55);
		
		ll.add(41);
		
		System.out.println(ll);
		
		System.out.println("=====descending iterator====");
		
		Iterator<Integer> dit=ll.descendingIterator();
		
		while(dit.hasNext())
		{
			System.out.println(dit.next());
		}
		
		System.out.println("======for loop=======");
		
		for(int i=0; i<ll.size(); i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("=======for each========");
		
		for(Integer  temp   : ll)
		{
			System.out.println(temp);
		}
		
		System.out.println("========iterator=======");
		
		Iterator<Integer> it=ll.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("=======list iterator======");
		
		ListIterator<Integer> lit=ll.listIterator();
		
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
		System.out.println("=========reverse list iterator======");
		
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		
		
	}

}
