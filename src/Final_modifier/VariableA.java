package Final_modifier;

public class VariableA 
{
	

	public static void main(String[] args) 
	{
		int a=10;
		
		System.out.println("Before change a value =" + a);
		
		a=55;
		
		System.out.println("After change a value = "+a);
		
		final int b=20;
		
		System.out.println("Before change b value = "+ b);
		
		//b=75;
		
		System.out.println("After change b value = "+ b);
		

	}

}
