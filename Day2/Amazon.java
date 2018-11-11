package Day2;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\I342079\\Downloads\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://amazon.in");
		driver.findElement(By.cssSelector("input[name='field-keywords']")).sendKeys("Iphon");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[name='field-keywords']")).sendKeys("e");
		List<WebElement> elements = driver.findElements(By.cssSelector("#suggestions>div.s-suggestion"));
		System.out.println();
		Iterator<WebElement> it = elements.iterator();
			while(it.hasNext())
				System.out.println(it.next().getText());
		// TODO Auto-generated method stub

	}

}
