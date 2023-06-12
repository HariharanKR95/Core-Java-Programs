package Single_inheritance;

public class Variables_Example2 extends Variables_Example1
{
	
	String n3="Shyam";
	
	static String n4="Monish";
	
	
	public void getAllVariables1()
	{
		String n5="Giri", n6="Giridharan"; //local variable
		
		System.out.println(n1);
		
		System.out.println(n2);
		
		System.out.println(n3);
		
		System.out.println(n4);
		
		System.out.println(n5);
		
		System.out.println(n6);
	}
	
	public static void getAllVariables2()
	{
		String n5="Giri", n6="Giridharan";
		
		Variables_Example2 v2=new Variables_Example2();
		
		System.out.println(v2.n1);
		
		System.out.println(n2);
		
		System.out.println(v2.n3);
		
		System.out.println(n4);
		
		System.out.println(n5);
		
		System.out.println(n6);
		
		
	}

	public static void main(String[] args) 
	{
		
		Variables_Example2 e2=new Variables_Example2();
		
		e2.getAllVariables1();
		
		System.out.println("=========================");
		
		getAllVariables2();
	}

}
