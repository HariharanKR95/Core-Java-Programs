package Interface_Example1;

public class FirefoxDriver implements WebDriver
{

	@Override
	public void get(String url) {
		
		System.out.println(url);
		
	}

	@Override
	public void close() {
	
		System.out.println("Firefox Driver closed");
	}

	@Override
	public String getTittle() {
		
		return "amazon";
	}

	@Override
	public String getcurrentUrl() 
	{
		
		return "https://www.amazon.in";
	}

	@Override
	public String getAttribute(String str) 
	{
		
		return "name";
	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		
	}

}
