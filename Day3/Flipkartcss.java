package Day3;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.exception.ExceptionContext;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkartcss {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\I342079\\Downloads\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://flipkart.com");
		driver.findElement(By.xpath("//form//input[@type='password']/parent::div/preceding-sibling::div/input")).sendKeys("7837510764");
		driver.findElement(By.xpath("//form//input[@type='password']")).sendKeys("Loveumuma@123");
		driver.findElement(By.xpath("//form//input[@type='password']/parent::div/following-sibling::div//button")).sendKeys(Keys.ENTER);
		String query = "Redmin Note 5 pro";
		driver.findElement(By.cssSelector("input[title='Search for products, brands and more']")).sendKeys(query);
		driver.findElement(By.cssSelector("input[title='Search for products, brands and more']")).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='Redmi Note 5 Pro (Gold, 64 GB)']")).sendKeys(Keys.ENTER);
		String expectedTitle = query + " - Buy Products Online at Best Price in India | Flipkart.com";
		//WebDriverWait wait= new WebDriverWait(driver,4,4000);
		
		//wait.until(ExpectedConditions.titleIs(expectedTitle));
		
		WebElement result = driver.findElement(By.cssSelector("html title"));
		System.out.println(result.getText());
		
		if(expectedTitle.equals(result.getText()))
		{
			System.out.println("true");
		}
		System.out.println(driver.findElement(By.cssSelector("div h1 span")).getText().substring(18, 22));
			

	}

}
