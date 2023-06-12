package Abstraction;

public abstract class WebDriver 
{
	public abstract void get(String url);
	
	public abstract String getTitle();
	
	public abstract void close();
	
	public abstract String getCurrentUrl();
	
	public abstract void quit();
	
	public void add()
	{
		System.out.println("add method");
	}

}
