package Method_Example;

public class Sample2 
{
	
	public void m1()
	{
		System.out.println("Method1 instance");
	}
	
	public static void m2()
	{
		System.out.println("Method2 static");
	}
	
	

	public static void main(String[] args) 
	{
		m2();

		Sample2 s2=new Sample2();
		
		s2.m1();
		
		m2();
		
		m2();
	}

}
