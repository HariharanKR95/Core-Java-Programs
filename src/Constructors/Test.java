package Constructors;

public class Test {
	
	public Test()
	{
		this(10);
		System.out.println("No argument constructor");
	}
	
	public Test(int a)
	{
		this(20,20);
		System.out.println("One argument constructor "+ a);
	}
	
	public Test(int a, int b)
	{
		this(10,30.5f,60.5);
		System.out.println("Two argument constructor "+ (a+b));
	}
	
	public Test(int a, float b, double c)
	{
		System.out.println("Three arugment constructor "+ (a+b+c));
	}
	
	public Test(String name, String name1, String name2, String name3)
	{
		this();
		
		System.out.println("Four arugment constructor "+(name+name1+name2+name3));
	}

	public static void main(String[] args) 
	{
		new Test("J","A","V","A");  
		
	}

}
