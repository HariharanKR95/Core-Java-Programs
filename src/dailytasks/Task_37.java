package dailytasks;

public class Task_37 {

	public static void main(String[] args) {
		
		String str="GOODMORNING";
		String revstr="";
		
		System.out.println("original string:"+str+revstr);
		
		for(int i=0;i<str.length();i++)
		{
			revstr=str.charAt(i)+revstr;
			
			
		}

		System.out.println("reverse string:"+revstr);
	}

}
