package Hybrid_Inheritance;

public class CarDetails {

	public static void main(String[] args) 
	{
		KIA_Motors kia= new Car_Specfication();
		
		kia.Car_Mileage(25);
		
		kia.Car_Price(80000);
		
		kia.KIA_Color();
		
		kia.KIA_Spec();
		
		 System.out.println("=========================");
		 
		 MG_Motor mg= new Car_Specfication();
		 
		 mg.Car_Mileage(20);
		 
		 mg.Car_Price(1100000);
		 
		 mg.MG_Color();
		 
		 mg.MG_Spec();
		 
		 System.out.println("=========================");
		 
		 Tata_Motors tm=new Car_Specfication();
		 
		 tm.Car_Mileage(312);
		 
		 tm.Car_Price(1600000);
		 
		 tm.Tata_Color();
		 
		 tm.Tata_Spec();

	}

}
