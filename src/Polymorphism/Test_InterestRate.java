package Polymorphism;

public class Test_InterestRate {

	public static void main(String[] args) 
	{
		
		RBI r=new ICICI();
		
		r.simpleInterest(300000, 20, 5);
		
		RBI r1=new HDFC();
		
		r1.simpleInterest(300000, 20, 5);
		
		RBI r2=new SBI();
		r2.simpleInterest(300000, 20, 5);
		
		RBI r3=new RBI();
		r3.simpleInterest(300000, 20, 5);

	}

}
