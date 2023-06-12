package collection;

import java.util.ArrayList;

public class ArrayList_Example {
	
	//data type ---> primitive --> byte, short, int, long, float, double, char,boolean
	
	//classes --> wrapper classes --> Byte, Short, Integer, Long, Float, Double, Boolean, Character

	//Non primitive --> String, Array
	
	//Wrapper classes --> String , Array 
	
	
	public static void main(String[] args) 
	{
	
		 ArrayList al=new ArrayList();
		 
		 al.add(10);
		 
		 al.add(25.5f);
		 
		 al.add(true);
		 
		 al.add("Selenium");
		 
		 al.add('c');
		 
		 al.add(100);
		 
		 al.add(24.5);
		 
		 System.out.println(al);
		 
		 ArrayList<Object> temp=new ArrayList<Object>();
		 
		 temp.add(10);
		 
		 temp.add(20);
		 
		 temp.add(30);
		 
		 temp.add(40);
		 
		 temp.add(50);
		 
		 temp.add(60);
		 
		 temp.add("Selenium");
		 
		 System.out.println(temp);
		 
		 ArrayList<Integer> tp=new ArrayList<Integer>();
		 
		 tp.add(10);
		 
		 tp.add(20);
		 
		 tp.add(30);

		 
		 ArrayList<String> tp1=new ArrayList<String>();
		 
		 tp1.add("Selenium");
		 
		 tp1.add("Java");
		 
		 tp1.add("TestNG");
	}

}
