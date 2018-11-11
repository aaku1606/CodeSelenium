package Day2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\I342079\\Downloads\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		List<WebElement> linksPresent = driver.findElements(By.tagName("a"));
		Iterator<WebElement> it = linksPresent.iterator();
	/*	while(it.hasNext())
			System.out.println(it.next().getText());
		*/
		for(int i=0;i<linksPresent.size();i++)
		{
			System.out.println(linksPresent.get(i).getText());
		}
		List<WebElement> imagesPresent = driver.findElements(By.tagName("img"));
		System.out.println("Images Present are "+ imagesPresent.size());
		System.out.println("Links Present are" + linksPresent.size());
		driver.findElement(By.linkText("Privacy")).click();
		//driver.findElement(By.linkText("Terms")).click();
		driver.findElement(By.partialLinkText("Term")).click();
		driver.close();
		// TODO Auto-generated method stub

	}

}
