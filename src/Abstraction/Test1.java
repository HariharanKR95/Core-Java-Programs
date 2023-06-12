package Abstraction;

public class Test1 extends Sample1
{

	@Override
	public void mul() 
	{
		int a=5,b=5,c;
		
		c=a*b;
		
		System.out.println("Mul Result = "+ c);
		
	}

	@Override
	public void div() 
	{
		int a=15,b=5,c;
		
		c=a/b;
		
		System.out.println("Div Result = "+ c);
		
		
	}

}
