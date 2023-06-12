package Hierarchy_inheritance;

public class SampleB extends SampleA
{
	
	public void getAll1()
	{
		System.out.println(super.a);
		System.out.println(SampleB.b);
		super.m1();
		super.m2();
		
	}
	
	public static void getAll2()
	{
		SampleB bobj=new SampleB();
		
		System.out.println(bobj.a);
		
		System.out.println(SampleB.b);
		
		bobj.m1();
		
		SampleB.m2();
	}
	
	public static void main(String[] args) 
	{
		SampleB obj=new SampleB();
		
		obj.getAll1();
		
		System.out.println("=====================");
		
		getAll2();
	}

}
