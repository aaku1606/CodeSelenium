package Day3;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\I342079\\Downloads\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://flipkart.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	
		WebElement menMenu = driver.findElement(By.xpath("//li/a[@title='Men']"));
		Actions myactions = new Actions(driver);
		myactions.moveToElement(menMenu).build().perform();
		 WebElement clickable = driver.findElement(By.xpath("//span[text()='Shirts']"));
		 WebDriverWait wait= new WebDriverWait(driver,4,400);
			
			wait.until(ExpectedConditions.elementToBeClickable(clickable));
			clickable.click();
		
		//Alert myalert = driver.switchTo().alert();
		//System.out.println(myalert.getText());
		//myalert.accept();
		
		

	}

}
