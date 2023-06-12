package Multiple_Inheritance;

public class Sample {

	public static void main(String[] args) 
	{
		
		DemoC cobj=new Test();
		
		cobj.getName();
		
		cobj.getTitle();
		
		DemoB bobj=new Test();
		
		bobj.add();
		
		bobj.sub();
		
		DemoA aobj=new Test();
		
		aobj.m1();
		
		aobj.m2();
		
		
	}

}
