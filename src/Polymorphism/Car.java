package Polymorphism;

public class Car 
{
	
	public void Car_Spec(String Carbrand, String Carmodel, int Carmileage, int mfy)
	{
		System.out.println("Car Brand = "+ Carbrand);
		System.out.println("Car Model = "+ Carmodel);
		System.out.println("Car Mileage = "+ Carmileage);
		System.out.println("Car MFY = "+mfy);
	}
	
	public void Car_Spec(String Carbrand, String Carmodel, int Carmileage, String Carcolor)
	{
		System.out.println("Car Brand = "+ Carbrand);
		System.out.println("Car Model = "+ Carmodel);
		System.out.println("Car Mileage = "+ Carmileage);
		System.out.println("Car Color = "+Carcolor);
	}
	
	public void Car_Spec(String Carbrand, String Carmodel, int Carmileage, int mfy,String Carcolor)
	{
		System.out.println("Car Brand = "+ Carbrand);
		System.out.println("Car Model = "+ Carmodel);
		System.out.println("Car Mileage = "+ Carmileage);
		System.out.println("Car MFY = "+ mfy);
		System.out.println("Car Color = "+Carcolor);
	}
	
	public void Car_Spec(String Carbrand, String Carmodel, int Carmileage, String EngineType, int Seater)
	{
		System.out.println("Car Brand = "+ Carbrand);
		System.out.println("Car Model = "+ Carmodel);
		System.out.println("Car Mileage = "+ Carmileage);
		System.out.println("Car Engine Type = "+ EngineType);
		System.out.println("Car Seat count = "+Seater);
	}


	public static void main(String[] args) 
	{
		Car renault=new Car();
		
		renault.Car_Spec("Renault", "Kwid", 20, 2021);
		
		System.out.println("=========================");
		
		
		Car Tata=new Car();
		
		Tata.Car_Spec("TATA", "Nexon", 312, "EV", 5);
		
		System.out.println("=========================");
		
		Car MG=new Car();
		
		MG.Car_Spec("MG_Motors", "Hector", 23, 2022);
		MG.Car_Spec("MG-Motors", "Hector", 25, "RED");

	}

}
