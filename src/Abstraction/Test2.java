package Abstraction;

public class Test2 extends Sample1 {

	@Override
	public void mul() 
	{
		System.out.println("Abstract method implementation");
		
		System.out.println(10*10);
		
	}

	@Override
	public void div() 
	{
		System.out.println("Abstract method implementation");
		
		System.out.println(50/10);
		
	}

}
