package Single_inheritance;

public class Method_Example2  extends Method_Example1
{
	
	public void mul()
	{
		System.out.println("Mul method Method_Example2");
	}
	
	public static void div()
	{
		System.out.println("Div method Method_Example2");
	}
	
	public void getAllMethods1()
	{
		add();
		
		mul();
		
		sub();
		
		div();
	}
	
	public static void getAllMethods2()
	{

		Method_Example2 e2=new Method_Example2();
		
		e2.mul();
		
		div();
		
		e2.add();
		
		sub();
	}
	
	public static void main(String[] args) 
	{
	   
		Method_Example2 e2=new Method_Example2();
	
	    e2.getAllMethods1();
	    
	    System.out.println("=====================");
	    
	    getAllMethods2();
	
		
	}

}
