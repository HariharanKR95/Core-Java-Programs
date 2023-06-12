package Blocks;

public class Sample  
{
	
	static
	{
		System.out.println("Static block");
		
		Sample s=new Sample();
		
		s.add();
		
		sub();
		
		Sample s1=new Sample();
		
	
	}
	
	
	{
		System.out.println("instance block");
	}
	
	
	public void add()
	{
		System.out.println("instance method");
	}
	
	public static void sub()
	{
		System.out.println("Static method");
	}
	
	public Sample()
	{
		System.out.println("Constructor1");
	}

	public static void main(String[] args) 
	{
		

	}

}
