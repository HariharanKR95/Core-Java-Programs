package Constructors;

public class Sample {
	
	public Sample()
	{
		System.out.println("No argument constructor");
	}
	
	public Sample(int a)
	{
		System.out.println("One argument constructor "+ a);
	}
	
	public Sample(int a, int b)
	{
		System.out.println("Two argument constructor "+ (a+b));
	}
	
	public Sample(int a, float b, double c)
	{
		System.out.println("Three arugment constructor "+ (a+b+c));
	}
	
	public Sample(String name, String name1, String name2, String name3)
	{
		System.out.println("Four arugment constructor "+(name+name1+name2+name3));
	}

	public static void main(String[] args) 
	{
		new Sample("J","A","V","A");  
		new Sample();
		new Sample(1000);
		new Sample(500,250);
		new Sample(10,20.5f,30.5);
	}

}
