package instancevsstatic;

public class Employee {
	
	String Empid;
	
	String EmpName;
	
	String Mobile_no;
	
	static String CompanyName="TCS";
	
	public Employee(String Empid, String EmpName, String Mobile_no)
	{
		this.Empid=Empid;
		
		this.EmpName=EmpName;
		
		this.Mobile_no=Mobile_no;
		
		
	}
	
	
	public void getEmpDetails()
	{
		System.out.println("Emp id = "+this.Empid);
		
		System.out.println("Emp name = "+ this.EmpName);
		
		System.out.println("Emp mobile no = "+this.Mobile_no);
		
		System.out.println("Emp company = "+ CompanyName);
		
		System.out.println("===================================");
	}

	public static void main(String[] args) 
	{
		
		Employee e1=new Employee("1","Rajesh","937845645");
		
		e1.getEmpDetails();
		
		
		Employee e2=new Employee("2","Umesh","937845635");
		
		e2.getEmpDetails();
		
		
		Employee e3=new Employee("3","Kumar","937833553");
		
		e3.getEmpDetails();
		
		
		Employee e4=new Employee("4","Kamal","9378938333");
		
		e4.getEmpDetails();
	}

}
