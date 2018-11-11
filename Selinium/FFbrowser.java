package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFbrowser {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\I342079\\Downloads\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
	}

}
