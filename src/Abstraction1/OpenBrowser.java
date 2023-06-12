package Abstraction1;

import Abstraction.ChromeDriver;
import Abstraction.FirefoxDriver;
import Abstraction.WebDriver;

public class OpenBrowser {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		String actual_title=driver.getTitle();
		
		System.out.println(actual_title);
		
		driver.add();
		
		
		WebDriver driver1=new FirefoxDriver();
		
		driver1.get("http://www.google.com");
		
		String actual_title1=driver1.getTitle();
		
		System.out.println(actual_title1);
		
		driver1.add();

	}

}
