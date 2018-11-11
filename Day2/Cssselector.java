package Day2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cssselector {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\I342079\\Downloads\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("Sele");
		Thread.sleep(1000);
		List<WebElement> elements = driver.findElements(By.cssSelector("ul.sbsb_b div[id*=sbse]"));
		System.out.println();
		Iterator<WebElement> it = elements.iterator();
			while(it.hasNext())
				System.out.println(it.next().getText());
			
		
		// TODO Auto-generated method stub

	}

}
