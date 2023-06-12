package Method_Example;

public class Sample3 {
	
	public void add()
	{
		System.out.println("Add instance method");
		mul(); //i-i-d
	}
	
	public static void sub()
	{
		System.out.println("Sub static method");
		
		div(); //s-s-d
	}
	
	public void mul()
	{
		System.out.println("Mul instance method");
		sub(); //s-i-d
	}
	
	public static void div()
	{
		System.out.println("Div static method");
	}

	public static void main(String[] args) 
	{
		
		Sample3 s3=new Sample3();
		
		s3.add();  //i-s-o
	}

}

//static method ---> static method ---> direct

//instance method ---> instance method ---> direct

//static method ---> instance method ---> direct

//instance method --> static method ---> object
