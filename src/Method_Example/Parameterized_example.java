package Method_Example;

public class Parameterized_example {
	
	public void add(int a, float b)
	{
		float c=a+b;
		
		System.out.println("Add result ="+c);
	}
	
	public void sub(double a, double b)
	{
	  double c=a-b;
	  
	  System.out.println("Subraction result is "+c);
	}
	
	public void mul(int a, int b)
	{
		int c=a*b;
		
		System.out.println("Multiplication result is "+ c);
	}
	
	public void div(int a, float b, double c)
	{
		double d=(a+b)/c;
		
		System.out.println("Division result is "+ d);
	}

	public static void main(String[] args) 
	{
		Parameterized_example p=new Parameterized_example();
		
		p.add(10, 45.5f);
		p.mul(5, 5);
		p.add(25, 33.5f);
		p.sub(25.5, 12.5);
		p.div(10, 40, 5);
	
	}

}
