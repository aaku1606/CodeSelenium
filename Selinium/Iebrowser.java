package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Iebrowser {
	public static void main(String args[])
	{
		System.setProperty("webdriver.ie.driver","C:\\Users\\I342079\\Downloads\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://google.com");
		driver.close();
	}

}
