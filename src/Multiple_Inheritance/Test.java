package Multiple_Inheritance;

public class Test implements DemoA, DemoB,DemoC
{

	@Override
	public void getName() 
	{
		System.out.println("Demo C interface method1");
		
	}

	@Override
	public void getTitle() 
	{
		System.out.println("Demo C interface method2");
		
	}

	@Override
	public void add() 
	{
		
		System.out.println("Demo B interface method1");
	}

	@Override
	public void sub() 
	{
		System.out.println("Demo B interface method2");
		
	}

	@Override
	public void m1() 
	{
		System.out.println("Demo A interface method1");
		
	}

	@Override
	public void m2() 
	{
		
		System.out.println("Demo A interface method2");
	}

}
