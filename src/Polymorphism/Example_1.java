package Polymorphism;

public class Example_1 
    {
	
		float salary=40000;
	
    }	
	class programmer extends Example_1
	{
		int bonus=10000;
		
	

	public static void main(String[] args) 
	{
		programmer p=new programmer();
		 System.out.println(p.salary);
		 System.out.println(p.bonus);
	
	}
	
}
