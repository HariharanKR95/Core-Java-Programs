package Abstraction;

public abstract class Sample1 
{
	
	int a=10;  // instance variable
	
	static int b=20; //static variable
	
	public void add()
	{
		int a=10; //local variable
		
		System.out.println("Local variable "+ a);
		
		System.out.println("global variable instance "+ this.a);
		
		System.out.println("global variable static "+ b);
		
		System.out.println("Instance method");
	}
	
	public static void sub()
	{
		System.out.println("Static method");   
	}
	
	public Sample1()
	{
		System.out.println("Constructor");
	}
	
	
	{
		System.out.println("instance block");
	}
	
	static
	{
		System.out.println("Static block");
		
		
	}
	
	public abstract void mul();  //abstract method
	
	public abstract void div();  //abstract method
	
	

	public static void main(String[] args) 
	{
		
		sub();

	}

}
