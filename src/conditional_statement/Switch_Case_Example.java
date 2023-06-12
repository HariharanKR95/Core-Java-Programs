package conditional_statement;

public class Switch_Case_Example {

	public static void main(String[] args) {
	
		String browser="Safari";
		
		switch(browser)
		{
		  
		case "Chrome":
			System.out.println("Chrome Version 105");
			break;
			
		case "Firefox":
			System.out.println("Firefox Version 104");
			break;
			
		case "Opera":
			System.out.println("Opera Version 102");
			break;
			
		case "Edge":
			System.out.println("Edge Version 103");
			break;
		
		case "IE":
			System.out.println("IE Version 10");
			break;
		
		default:
			System.out.println("Given browser is wrong");
		}

	}

}
