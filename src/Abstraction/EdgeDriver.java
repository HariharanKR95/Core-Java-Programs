package Abstraction;

public class EdgeDriver extends WebDriver{

	@Override
	public void get(String url) 
	{
	
		System.out.println(url);
	}

	@Override
	public String getTitle() {
		
		return "Flipkart";
	}

	@Override
	public void close() {
		
		System.out.println("Window closed");
	}

	@Override
	public String getCurrentUrl() {
		
		return "https://www.flipkart.com";
	}

	@Override
	public void quit() {
		
		System.out.println("All Window closed");
	}

}
