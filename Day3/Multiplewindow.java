package Day3;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Multiplewindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\I342079\\Downloads\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Data Policy")).click();
		//driver.findElement(By.linkText("Terms")).click();
		driver.findElement(By.partialLinkText("Terms")).click();
		
		WebDriverWait wait= new WebDriverWait(driver,4,4000);
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		Set<String> allHandles = driver.getWindowHandles();
		System.out.println(allHandles.size());
		Iterator<String> it = allHandles.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			wait.until(ExpectedConditions.not(ExpectedConditions.titleIs("")));
			System.out.println(driver.getTitle());
			
		}
		
		
			driver.quit();
		//Select MONTHSELECTED = new Select(driver.findElement(By.id("month")));
		//System.out.println("fIRST SELECTED MONTH" + MONTHSELECTED.getFirstSelectedOption().getText());

	}

}
