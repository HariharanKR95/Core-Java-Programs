package Multilevel_inheritance;

public class VariablesC extends VariablesB 
{
	
	String pgm="Python";
	
	static String at="Robot framework";
	
	public void getAllvariables1()
	{
		String pgm="ruby", at="Selenium";
		
		System.out.println(pgm);
		
		System.out.println(at);
		
		System.out.println(this.pgm);
		
		System.out.println(VariablesC.at);
		
		System.out.println(super.pgm);
		
		System.out.println(VariablesB.at);
		
		VariablesA aobj=new VariablesA();
		
		System.out.println(aobj.pgm);
		
		System.out.println(VariablesA.at);
	}
	
	public static void getAllvariables2()
	{
		String pgm="ruby", at="Selenium";
		
		System.out.println(pgm);
		
		System.out.println(at);
		
		VariablesC cobj=new VariablesC();
		
		System.out.println(cobj.pgm);
		
		System.out.println(VariablesC.at);
		
		VariablesB bobj=new VariablesB();
		
		System.out.println(bobj.pgm);
		
		System.out.println(VariablesB.at);
		
		VariablesA aobj=new VariablesA();
		
		System.out.println(aobj.pgm);
		
		System.out.println(VariablesA.at);
		
		
	}
	
	public static void main(String[] args) {
		
		VariablesC c=new VariablesC();
		
		c.getAllvariables1();
		
		System.out.println("======================");
		
		getAllvariables2();
	}

}
