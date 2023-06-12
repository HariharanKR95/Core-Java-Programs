package Abstraction;

public class FirefoxDriver extends WebDriver {

	@Override
	public void get(String url) {
		
		System.out.println(url);
		
	}

	@Override
	public String getTitle() {
		
		return "Amazon.in";
	}

	@Override
	public void close() {
		
		System.out.println("Window close");
		
	}

	@Override
	public String getCurrentUrl() {
		
		return "http://www.amazon.in";
	}

	@Override
	public void quit() {
		
		System.out.println("All Window close");
		
	}

}
