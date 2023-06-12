package Single_inheritance;

public class Method_Example4  extends Method_Example3
{
	
	public void add()
	{
		System.out.println("Add method Method_Example4");
	}
	
	public static void sub()
	{
		System.out.println("Sub method Method_Example4");
	}
	
	public void getAllMethods1()
	{
		this.add();
		
		super.add();
		
		//this.sub();
		
		//super.sub();
		
		Method_Example4.sub();
		
		Method_Example3.sub();
	}
	
	public static void getAllMethods2()
	{

		Method_Example4 e4=new Method_Example4();
		
		e4.add();
		
		Method_Example3 e3=new Method_Example3();
		
		e3.add();
		
		Method_Example3.sub();
		
		Method_Example4.sub();
	}
	
	public static void main(String[] args) 
	{
	   
		Method_Example4 e2=new Method_Example4();
	
	    e2.getAllMethods1();
	    
	    System.out.println("=====================");
	    
	    getAllMethods2();
	
		
	}

}


//instance method to instance method ---> direct, this, super

//static method to static method ---> direct, class name

//static method to instance method ---> direct, class name, this, super

//instance method to static method ---> object
