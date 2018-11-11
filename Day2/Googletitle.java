package Day2;

import java.util.Iterator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Googletitle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\I342079\\Downloads\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("Sele");
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys(Keys.ENTER);
		String expectedTitle = "Sele" + " - ";
		WebDriverWait wait= new WebDriverWait(driver,4,4000);
		
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		
		WebElement result = driver.findElement(By.cssSelector("html title"));
		System.out.println(result.getText());
		
		if(expectedTitle.equals(result.getText()))
		{
			System.out.println("true");
		}
			
		
		// TODO Auto-generated method stub

	}

}
