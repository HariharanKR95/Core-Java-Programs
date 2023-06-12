package Hierarchy_inheritance;

public class SampleC extends SampleA
{
	int c=3000;
	
	static int d=4000;
	
	public SampleC()
	{
		System.out.println("SampleC Class Constructor");
	}
	
	public void m3()
	{
		System.out.println("SampleC Class instance method");
	}
	
	public static void m4()
	{
		System.out.println("SampleC Class static method");
	}
	
	public void getAll1()
	{
		System.out.println(super.a);
		System.out.println(SampleC.b);
		System.out.println(this.c);
		System.out.println(SampleC.d);
		super.m1();
		SampleC.m2();
		this.m3();
		SampleC.m4();
	}
	
	
	public static void getAll2()
	{
		SampleC cobj=new SampleC();
		
		System.out.println(cobj.a);
		System.out.println(SampleC.b);
		System.out.println(cobj.c);
		System.out.println(SampleC.d);
		
		cobj.m1();
		SampleC.m2();
		cobj.m3();
		SampleC.m4();
			
		
	}

	public static void main(String[] args) 
	{
		SampleC c=new SampleC();
		
		c.getAll1();
		
		System.out.println("========================");
		
		getAll2();
	}

}
