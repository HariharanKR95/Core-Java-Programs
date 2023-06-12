package Interface_Example1;

public interface SampleA 
{
	int k=10; //public static  final int k=10;
	
	//public static final int z=1000;
	
	int z=1000;
	
	public void m1();
	
	public abstract void m2();
	
	public static void add()
	{
		int a=10;
		System.out.println("Static method");
	}
	
	public static void main(String[] args) 
	{
		
	}
}


//instance method, constructor , instance block , static block, object