package OOPS;

public class SampleB extends SampleA
{
	
	public void mul()
	{
		System.out.println("instance method SampleB class");
	}
	
	public static void div()
	{
		System.out.println("static method SampleB class");
	}

	public static void main(String[] args) 
	{
		SampleB b=new SampleB();
		
		b.add();
		
		sub();
		
		b.mul();
		
		div();
		

	}

}
