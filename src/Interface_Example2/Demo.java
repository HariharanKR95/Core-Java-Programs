package Interface_Example2;

public class Demo implements SampleB_inter
{

	@Override
	public void add() 
	{
		System.out.println("Sample interface A method add");
	}

	@Override
	public void sub() 
	{
		System.out.println("Sample interface A method sub");
		
	}

	@Override
	public void mul() 
	{
		System.out.println("Sample interface B method mul");
		
	}

	@Override
	public void div() 
	{
		
		System.out.println("Sample interface B method div");
	}

}
