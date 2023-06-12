package Constructors;

public class Employee 
{
	
	public Employee()
	{
		System.out.println("Constructor");
	}
	
	
	
	public void m1()
	{
		System.out.println("instance method");
	}
	
	public static void m2()
	{
		System.out.println("static method");
	}

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		
		e1.m1();
		
		m2();

	}

}
