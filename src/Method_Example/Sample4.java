package Method_Example;

public class Sample4 {
	
	public void m1()
	{
		m2();
		System.out.println("instance method1");
	}
	
	public void m2()
	{
		
		System.out.println("instance method2");
	}
	
	public static void m3()
	{
		Sample4 s4=new Sample4();
		s4.m1();
		
		System.out.println("static method1");
	}
	
	public static void m4()
	{
		m3();
		System.out.println("static method2");
	}

	public static void main(String[] args) 
	{
		m4();
	}

}
