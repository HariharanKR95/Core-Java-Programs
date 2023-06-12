package Variables_Example;

public class Example5 {
	
	String name="Jone";  // global instance
	
	static String name1="Geetha"; //global static
	
	public void getName()
	{
		String name2="Giri",name3="Monish";  //local variable
		
		System.out.println(name2);
		
		System.out.println(name3);
		
		System.out.println(name);
		
		System.out.println(name1);
	}
	
	
	public static void getName1()
	{
		String name4="Shyam";     //local variable
		
		System.out.println(name4);
		
		Example5 v5=new Example5();
		
		System.out.println(v5.name);
		
		System.out.println(name1);
	}

	public static void main(String[] args) {
		
		Example5 e5 =new Example5();
		
		e5.getName();
		
		System.out.println("========");
		
		
		getName1();

	}

}
