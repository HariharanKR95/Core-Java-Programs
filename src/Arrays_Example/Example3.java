package Arrays_Example;

public class Example3 {

	public static void main(String[] args) 
	{
		
	   String lang[][]= {{"java","Selenium","TestNG"},{"19","4.5","7.5"}};
	   
	   System.out.println(lang[0][0]);
	   System.out.println(lang[1][0]);
	   
	   System.out.println(lang[0][1]);
	   System.out.println(lang[1][1]);
	   
	   System.out.println(lang[0][2]);
	   System.out.println(lang[1][2]);
	   
	   String str[][]=new String[3][2]; //0,1,2 //0,1
	   
	   str[0][0]="username1";
	   str[0][1]="password1";
	   
	   str[1][0]="username2";
	   str[1][1]="password2";
	   
	   str[2][0]="username3";
	   str[2][1]="password3";
	   
	   
	   System.out.println(str[0][1]);
	   
	   

	}

}
