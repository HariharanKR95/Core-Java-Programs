package Method_Example;

public class Sample1 
{

	public void add()   //instance method
	{
		System.out.println(5+5);
	}
	
	public static void sub() //static method
	{
		System.out.println(10-5);
	}
	
	public void multiplication()
	{
		System.out.println(10*10);
	}
	
	public static void div()
	{
		System.out.println(100/5);
	}
	
	public static void main(String[] args) 
	{
		
		
		div();
		
		//new Sample1();  //object create  nameless object
		
		Sample1 s=new Sample1();  //name object
	
		s.add();
		
		s.multiplication();
		
		sub();
		
	}

}


//static method ---> static method ---> direct

//instance method ---> static method ---> using object

//instance method ---> instance method

//static method ---> instance method


/*
 * instance method
 * 
 * access_modifier return_type method_name()
 * {
 *    //logic;
 * }
 * 
 * static method
 * 
 * access_modifier static_modifier return_type method_name()
 * {
 *   //logic;
 * }
 */
