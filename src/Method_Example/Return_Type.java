package Method_Example;

public class Return_Type {
	
	public  int add(int a, int b)
	{
		
		int c=a+b;
		
		return c;	
		
	}
	
	public static float add1(int a, float b)
	{
		float c=a+b;
		
		return c;
	}
	
	public static double add2(float a, double b)
	{
		double c=a+b;
		
		return c;
	}
	
	public String getName(String Firstname, String lastname)
	{
		String fullname=Firstname+lastname;
		
		return fullname;
	}
	
	public String getName1(String fn, String ln)
	{
		return fn+ln;
		
	}

	public static void main(String[] args) 
	{
		Return_Type rt=new Return_Type();
		
		int addres=rt.add(25, 35);
		
		System.out.println("Add Result = "+ addres);
		
		String nameres=rt.getName("Suresh", "K");
		
		System.out.println(nameres);
		
		float f=add1(100, 125.5f);
		
		System.out.println(f);
		
	}

}
