package Multilevel_inheritance;

public class Sample_VariablesC extends Sample_VariablesB 
{
	
	int e=5;
	
	static int f=6;
	
	static Sample_VariablesC bj;
	
	public void getAllVariables1()
	{
		int g=7,h=8;
		
		System.out.println(h);
		
		System.out.println(g);
		
		System.out.println(f);
		
		System.out.println(e);
		
		System.out.println(d);
		
		System.out.println(c);
		
		System.out.println(b);
		
		System.out.println(a);
		
		
	}
	
	public static void getAllvariables2()
	{
		int g=7, h=8;
		
		System.out.println(h);
		System.out.println(g);
		System.out.println(f);
		bj=new Sample_VariablesC();
		System.out.println(bj.e);
		System.out.println(d);
		System.out.println(bj.c);
		System.out.println(b);
		System.out.println(bj.a);
	}
	
	public static void main(String[] args) {
		
		bj=new Sample_VariablesC();
		
		bj.getAllVariables1();
		
		System.out.println("=====================");
		
		getAllvariables2();
	}

}
