package Method_Example;


//Method overloading ---> Same method name argument is different.

public class Method_Overloading 
{
	public void add()
	{
		System.out.println("Hello");
	}
	
	public void add(int a)
	{
		System.out.println("Hi "+ a);
	}
	
	public void add(int a, int b)
	{
		System.out.println("Java");
	}
	
	public void add(float a, float b)
	{
		System.out.println("Selenium");
	}
	
	public void add(float c, int d)
	{
		System.out.println("TestNG");
	}
	
	public void add(float c, int d, double e)
	{
		System.out.println("POM");
	}
	
	public void add(int a, int b, int c)
	{
		System.out.println("DDF");
	}
	
	public static void main(String[] args) 
	{
		Method_Overloading m=new Method_Overloading();
		
		m.add();
		
		m.add(100.0f,200.0f);
		
		m.add(200.5f,100);
		
		m.add(25,25,25);
		
		m.add(25.5f,33,36.5);

	}

}



