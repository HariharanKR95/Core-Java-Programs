package Polymorphism;

public class SBI extends RBI
{
	
	public void simpleInterest(int p, int n, int rate)
	{
		int sbirate=rate+3;
		
		int r=((p*n*rate*sbirate)/100);
		
		System.out.println("SBI Interest Rate = "+ r);
	}

}
