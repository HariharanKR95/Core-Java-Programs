package Variables_Example;

public class Example4 {
	
	int a=20,b=10,c; //global variable (instance)
	
	static int x=50,y=45,z; //global variable (static)
	
	public void add()
	{
		c=a+b;
		
		System.out.println("Add result = "+ c);
		
		z=x+y;
		
		System.out.println("Add result = "+z);
	}
	
	public void sub()
	{
		c=a-b;
		
		System.out.println("Sub result = "+ c);
		
		z=x-y;
		
		System.out.println("Sub result = "+ z);
	}

	public static void main(String[] args) 
	{
		Example4 e4=new Example4();
		
		e4.add();
		
		System.out.println("=================");
		
		e4.sub();

	}

}
