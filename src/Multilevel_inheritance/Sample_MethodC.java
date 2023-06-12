package Multilevel_inheritance;

public class Sample_MethodC extends Sample_MethodB 
{
	
	public void m5()
	{
		System.out.println("Sample_MethodC class m5 method");
	}
	
	public static void m6()
	{
		System.out.println("Sample_MethodC class m6 static method");
	}
	
	public void getAllmethods1()
	{
		m5();
		
		m6();
		
		m4();
		
		m3();
		
		m1();
		
		m2();
	}
	
	public void getAllmethods2()
	{
		this.m5();
		
		this.m3();
		
		this.m1();
		
		Sample_MethodC.m6();
		
		Sample_MethodC.m4();
		
		Sample_MethodC.m2();
	}
	
	public void getAllmethods3()
	{
		this.m5();
		
		super.m3();
		
		super.m1();
		
		Sample_MethodC.m6();
		
		Sample_MethodC.m4();
		
		Sample_MethodC.m2();
	}
	
	public static void getAllmethods4()
	{
		Sample_MethodC cob=new Sample_MethodC();
		
		cob.m5();
		
		cob.m3();
		
		cob.m1();
		
		m6();
		
		m4();
		
		m2();
	}
	
	public static void main(String[] args) 
	{
		Sample_MethodC cobj=new Sample_MethodC();
		
		cobj.getAllmethods1();
		
		System.out.println("==========================");
		
		cobj.getAllmethods2();
		
		System.out.println("==========================");
		
		cobj.getAllmethods3();
		
		System.out.println("==========================");
		
		getAllmethods4();
		
		
	}

}
