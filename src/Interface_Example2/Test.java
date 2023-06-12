package Interface_Example2;

public class Test 
{
	
	public static void main(String[] args) 
	{
		SampleB_inter  bobj= new Demo();
		
		bobj.add();
		
		bobj.sub();
		
		bobj.mul();
		
		bobj.div();
		
		
		SampleA_inter aobj=new Demo();
		
		aobj.add();
		
		aobj.sub();
		
		/*Demo d=new Demo();
		
		d.add();
		
		d.sub();
		
		d.mul();
		
		d.div();*/
	}

}
