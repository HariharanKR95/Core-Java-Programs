package Arrays_Example;

public class Example4 {

	public static void main(String[] args) 
	{
		
		String str[][] = new String[5][2];
		
		str[0][0]="user1";
		str[0][1]="pwd1";
		
		str[1][0]="user2";
		str[1][1]="pwd2";
		
		str[2][0]="user3";
		str[2][1]="pwd3";
		
		str[3][0]="user4";
		str[3][1]="pwd4";
		
		str[4][0]="user5";
		str[4][1]="pwd5";
		
		System.out.println("======for loop=====");
		
		for(int i=0; i<str.length; i++) 
		{
			for(int j=0; j<2; j++)   
			{
				System.out.println(str[i][j]);
			}
		}
	
		
		System.out.println("======for each======");
		
		for(String ss[]  : str)
		{
			for(String s : ss)
			{
				System.out.println(s);
			}
		}
		
		

	}

}
