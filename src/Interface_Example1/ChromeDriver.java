package Interface_Example1;

public class ChromeDriver implements  WebDriver
{

	@Override
	public void get(String url) 
	{
	
		 System.out.println(url);
	}

	@Override
	public void close() 
	{
		
		System.out.println("Chrome window closed");
	}

	@Override
	public String getTittle() {
		
		return "facebook";
	}

	@Override
	public String getcurrentUrl() {
	
		return "http://www.fb.com";
	}

	@Override
	public String getAttribute(String str) {
		
		return "id";
	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		
	}

}
