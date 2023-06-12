package Single_inheritance;

public class Variables_Example4 extends Variables_Example3
{
	
	String n1="Shyam";
	
	static String n2="Monish";
	
	
	public void getAllVariables1()
	{
		String n1="Giri", n2="Giridharan"; //local variable
		
		System.out.println(n1);
		
		System.out.println(this.n1);
		
		System.out.println(super.n1);
		
		System.out.println(n2);
		
		System.out.println(Variables_Example4.n2);
		
		System.out.println(Variables_Example3.n2);
	}
	
	public static void getAllVariables2()
	{
		String n1="Giri", n2="Giridharan";
		
		System.out.println(n1);
		
		System.out.println(n2);
		
		Variables_Example4 v2=new Variables_Example4();
		
		System.out.println(v2.n1);
		
		System.out.println(Variables_Example4.n2);
		
		Variables_Example3 v3=new Variables_Example3();
		
		System.out.println(v3.n1);
		
		System.out.println(Variables_Example3.n2);
		
		
		
		
		
	}

	public static void main(String[] args) 
	{
		
		Variables_Example4 e2=new Variables_Example4();
		
		e2.getAllVariables1();
		
		System.out.println("=========================");
		
		getAllVariables2();
	}

}
