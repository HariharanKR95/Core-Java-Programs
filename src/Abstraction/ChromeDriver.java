package Abstraction;

public class ChromeDriver extends WebDriver {

	@Override
	public void get(String url) 
	{
		System.out.println(url);
	}

	@Override
	public String getTitle() 
	{
		
		return "Facebook" ;
	}

	@Override
	public void close() {
	
		System.out.println("Window closed");
		
	}

	@Override
	public String getCurrentUrl() {
	
		return "https://www.facebook.com";
	}

	@Override
	public void quit() {
		
		System.out.println("All Window closed");
		
	}

}
