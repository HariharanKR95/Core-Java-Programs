package Arrays_Example;

public class Example2 {

	public static void main(String[] args) 
	{
	
		String cities[] = {"Coimbatore","Chennai","Madurai","Salem","Erode","Kanchipuram"};
		
		System.out.println(cities.length);
	
		System.out.println(cities[3]);
		
		System.out.println("==================================");
		
		for(int i=0; i<cities.length; i++)  
		{
			System.out.println(cities[i]);
		}
		
		System.out.println("==================================");
		
		for(int j=cities.length-1;j>=0; j-- )
		{
			System.out.println(cities[j]);
		}
		
		System.out.println("===========for each=============");
		
		for(String city   : cities)
		{
			System.out.println(city);
		}
		
		System.out.println("==================================");
		
		int a[]=new int[10];
		
		a[0]=1000;
		a[1]=1100;
		a[2]=1200;
		a[3]=1300;
		a[4]=1400;
		a[5]=1500;
		a[6]=1600;
		a[7]=1700;
		a[8]=1800;
		a[9]=1900;
		
		for(int  aaa  : a)
		{
			System.out.println(aaa);
		}
		
		
		
	}

}
