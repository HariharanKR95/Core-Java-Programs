package Polymorphism;

public class HDFC extends RBI
{
	
	public void simpleInterest(int p, int n, int rate)
	{
		float hdfcrate=rate+1.7f;
		
		float r=((p*n*rate*hdfcrate)/100);
		
		System.out.println("HDFC Interest Rate = "+ r);
	}


}
