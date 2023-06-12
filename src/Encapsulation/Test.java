package Encapsulation;

public class Test {
	
	public static void main(String[] args) 
	{
		
		Employee e1=new Employee();
		
		e1.setEmpid(1);
		
		e1.setEmpname("Sam");
		
		int e1_Empid=e1.getEmpid();
		
		String e1_Empname=e1.getEmpname();
		
		System.out.println("Emp id = "+ e1_Empid);
		
		System.out.println("Emp Name = "+ e1_Empname);
		
		Employee e2=new Employee();
		
		e2.setEmpid(2);
		
		e2.setEmpname("Shree");
		
		int e2_Empid=e2.getEmpid();
		
		String e2_Empname=e2.getEmpname();
		
		System.out.println("Emp id = "+ e2_Empid);
		
		System.out.println("Emp Name = "+ e2_Empname);
		
		
	}

}
