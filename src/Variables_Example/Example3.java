package Variables_Example;

public class Example3 {
	
	public void add()
	{
		int a=10, b=20,c;  //local variable
		
		c=a+b;
		
		System.out.println("Add result is = "+c);
		
		
	}
	
	
	public void sub()
	{
		int x=55,y=45,z;  //local variable
		
		
		
		z=x-y;
		
		System.out.println("Sub result is = "+z);
	}

	public static void main(String[] args) 
	{
		Example3 e3=new Example3();
		
		e3.add();
		
		e3.sub();

	}

}
