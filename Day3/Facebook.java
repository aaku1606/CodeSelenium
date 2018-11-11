package Day3;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\I342079\\Downloads\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement year = driver.findElement(By.id("year"));
		
		Select yearDD = new Select(year);
		yearDD.selectByVisibleText("1905");
		
		List<WebElement> listOfYear= driver.findElements(By.id("year"));
		
		Iterator<WebElement> it = listOfYear.iterator();
		while(it.hasNext())
			System.out.println(it.next().getText());
		
		
			
		Select MONTHSELECTED = new Select(driver.findElement(By.id("month")));
		System.out.println("fIRST SELECTED MONTH" + MONTHSELECTED.getFirstSelectedOption().getText());

	}

}
