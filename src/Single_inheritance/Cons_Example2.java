package Single_inheritance;

public class Cons_Example2 extends Cons_Example1
{
	public Cons_Example2()
	{
		super();
		System.out.println("Child class constructor");
	}
	
	public Cons_Example2(int a)
	{
		this();
		System.out.println("Child class constructor 2 "+ a);
	}
	
	public static void main(String[] args) 
	{
		new Cons_Example2(10);
	}

}
