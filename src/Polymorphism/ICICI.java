package Polymorphism;

public class ICICI extends RBI
{
	
	public void simpleInterest(int p, int n, int rate)
	{
		double icicirate=rate+2.2;
		
		double r=((p*n*rate*icicirate)/100);
		
		System.out.println("ICICI Interest Rate = "+ r);
	}


}
