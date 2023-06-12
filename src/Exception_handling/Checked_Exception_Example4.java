package Exception_handling;

public class Checked_Exception_Example4 
{
	
	public static void main(String[] args) 
	{
		try
		{
		
		System.out.println("Hi");
		
		Thread.sleep(5000);
		
		System.out.println("Welcome");
		
		Thread.sleep(5000);
		
		System.out.println("I am learning java");
		
		Thread.sleep(5000);
		
		System.out.println("I know selenium automation");
		
		Thread.sleep(5000);
		
		System.out.println("I Know page object model framework");
		
		}
		
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
