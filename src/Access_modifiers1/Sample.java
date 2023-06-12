package Access_modifiers1;

public class Sample 
{
	//access modifiers --> public, private, default, protected ,package, static, abstract, final
	
	
	public void add()
	{
		System.out.println("add public method");
	}
	
	private void sub()
	{
		System.out.println("Sub private method");
	}
	
	
	void mul()
	{
		System.out.println("Mul default method");
	}
	
	protected void div()
	{
		System.out.println("Div protected method");
	}
	
	
	public static void main(String[] args) 
	{
		Sample s=new Sample();
		
		s.add();
		
		s.sub();
		
		s.mul();
		
		s.div();
	}

}

//public ---> with in the class, with in the package, outside the package

//private --> with in the class

//default ---> with in the class, with in the package

//protected --> with in the class, with in the package, outside the package parent and child relationship


