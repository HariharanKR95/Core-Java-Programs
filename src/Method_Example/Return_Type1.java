package Method_Example;

public class Return_Type1 {
	
	public static String getName()
	{
		return "Java";
	}
	
	public float m1()
	{
		return 25.5f;
	}
	
	public boolean m2()
	{
		return true;
	}
	
	public char m3()
	{
		return 's';
	}
	
	
	public static void main(String[] args) 
	{
		String str=getName();
		
		System.out.println(str);
		
		Return_Type1 r1=new Return_Type1();
		
		boolean f=r1.m2();
		
		System.out.println(f);
		
		float res=r1.m1();
		
		System.out.println(res);
		
		char res1=r1.m3();
		
		System.out.println(res1);
		
		

	}

}
