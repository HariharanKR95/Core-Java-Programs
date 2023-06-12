package String_Handling;

public class Example1 
{
	
	public static void main(String[] args) 
	{
		
		String str="I am a autoamtion tester";  //Literals --> SCP
		
		String str1=new String("I am a autoamtion teste"); //using new keyword //heap
		
		System.out.println(str);
		
		System.out.println(str1);
		
		String str2="I am a autoamtion tester";
		
		System.out.println(str.hashCode());
		
		System.out.println(str2.hashCode());
		
		String str3=new String("I am a autoamtion teste");
		
		System.out.println(str1.hashCode());
		
		System.out.println(str3.hashCode());
		
		
		
		
	}

}
