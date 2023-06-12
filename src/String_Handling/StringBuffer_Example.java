package String_Handling;

public class StringBuffer_Example 
{
	
	//String immutable object
	
	//String buffer mutable object
	

	public static void main(String[] args) {
		
		String s1=new String("Java");
		
		System.out.println("Before Concat = "+ s1);
		
		System.out.println(s1.concat(" is a high level programming language"));
		
		System.out.println("After concating = "+ s1);
		
		System.out.println("=============================");
		
		StringBuffer sb=new StringBuffer("Java");
		
		System.out.println("Before append "+ sb);
		
		System.out.println(sb.append(" is a high level programming language"));
		
		System.out.println("After Append "+ sb);
		
		
		System.out.print(sb.reverse());
		
		

	}

}
