package Exception_handling;

public class Sample {

	public static void main(String[] args) {
		
		int a=10,b=5,c=0;
		
		System.out.println("Hi");
		
		System.out.println("Welcome");
		
		System.out.println(a+b);
		
		System.out.println(a-b);
		
		try
		{
			System.out.println(a/c);  
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Skip the line");
		}
		
		System.out.println(a*b);
		
		System.out.println("Java");
		
		System.out.println("Selenium");

	}

}

