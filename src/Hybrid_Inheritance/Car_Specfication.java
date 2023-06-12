package Hybrid_Inheritance;

public class Car_Specfication implements Tata_Motors, MG_Motor, KIA_Motors
{

	@Override
	public void Car_Mileage(int mileage) 
	{
		
		System.out.println("Car mileage "+ mileage);
	}

	@Override
	public void Car_Price(int price) 
	{
		System.out.println("Car Price " + price);
		
	}

	@Override
	public void KIA_Spec() 
	{
		
		System.out.println("Kia Car trouq = 1200");
		
				
		System.out.println("Kia Car seater  =  5");
	}

	@Override
	public void KIA_Color() 
	{
		
		System.out.println("Kia Car color = Red");
	}

	@Override
	public void MG_Spec() 
	{
	
		System.out.println("MG Car trouq = 1200");
		
		System.out.println("MG Car seater  =  5");
	}

	@Override
	public void MG_Color() 
	{
		
		System.out.println("MG Car color = Black");
	}

	@Override
	public void Tata_Spec() 
	{
		
		System.out.println("Tata Car trouq = 1200");
		
		System.out.println("Tata Car seater  =  5");
	}

	@Override
	public void Tata_Color() 
	{
		
		System.out.println("Tata Car color = White");
	}

}
