package Interface_Example1;

public class EdgeDriver implements  WebDriver {

	@Override
	public void get(String url) 
	{
			System.out.println(url);	
	}

	@Override
	public void close() 
	{
	
		System.out.println("Edge browser close");
		
	}

	@Override
	public String getTittle() {
		
		return "Google";
	}

	@Override
	public String getcurrentUrl() 
	{
		
		return "http://www.google.co.in";
	}

	@Override
	public String getAttribute(String str) 
	{
		
		return "xpath";
	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		
	}

}


