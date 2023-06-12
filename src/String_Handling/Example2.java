package String_Handling;

public class Example2 
{
	
	public static void main(String[] args) {
		
		String str="java";
		
		String str1="SELENIEUM";
		
		String str2="selenium";
		
		String str3="SELENIUM";
		
		String str8="SELENIUM";
		
		String str4="";
		
		String str5=" ";
		
		String str6="   I am a automation tester   ";
		
		String str7="I am a automation tester,and i know java programming";
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str1.toLowerCase());
		
		System.out.println(str1.length());
		
		System.out.println(str1.charAt(4));
		
		System.out.println(str1.concat(" is a automation tool"));
		
		System.out.println(str1.concat(str));
		
		System.out.println(str1.contains("INU"));
		
		System.out.println(str1.endsWith("UM"));
		
		System.out.println(str1.startsWith("SE"));
		
		System.out.println(str1.equals(str3));
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str1.indexOf('N'));
		
		System.out.println(str1.lastIndexOf('E'));
		
		System.out.println(str1.replace('E', 'A'));
		
		System.out.println(str4.isBlank());
		
		System.out.println(str5.isBlank());
		
		System.out.println(str4.isEmpty());
		
		System.out.println(str5.isEmpty());
		
		System.out.println(str6.length());
		
		System.out.println(str6.trim().length());
		
		String[] st=str7.split(",");
		
		for(int i=0 ; i<st.length; i++)
		{
			System.out.println(st[i]);
		}
		
		System.out.println(str6.strip());
		
		
		System.out.println(str3.contentEquals(str8));
		
		System.out.println(str1.contentEquals(str8));
		
		System.out.println(str.compareTo(str2));
		
		
	}

}
