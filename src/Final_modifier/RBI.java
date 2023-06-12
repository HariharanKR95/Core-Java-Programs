package Final_modifier;

public class RBI 
{
	
	public void getRateofInterest()
	{
		System.out.println("RBI interest rate is 5%");
	}
	
	
	public final void getRateofInterest(int rate)
	{
		System.out.println("RBI Interest rate = "+ rate);
	}

}
