package Method_Example;

public class Example1 {
	
	public void add()
	{
		int a=55,b=45,c;
		
		c=a+b;
		
		System.out.println("Add result is =" + c);
	}
	
	public void addition(int a, int b)
	{
		int c =a+b;
		
		System.out.println("Addition result is "+ c);
	}

	public static void main(String[] args) 
	{
		Example1 e1=new Example1();
		
		e1.add();
		
		e1.addition(40, 60);
		
		e1.addition(50, 150);
		
	}

}
