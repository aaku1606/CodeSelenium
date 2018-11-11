
package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Enteringvalueinselinum {

	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\I342079\\Downloads\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//WebElement Email = driver.findElement(By.id("identifierId"));
		//Email.sendKeys("xyz@gmail.com");
		//driver.findElement(By.className("RveJvd")).click();
		driver.findElement(By.name("identifier")).sendKeys("xyz@gmail.com");
		
	}
}
