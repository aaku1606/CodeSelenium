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

public class Draganddrop {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\I342079\\Downloads\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		driver.switchTo().frame(0);
		WebElement menMenu = driver.findElement(By.xpath("//div/span"));
		
		Actions myactions = new Actions(driver);
		int maxoffsert = driver.findElement(By.id("slider")).getSize().width;
		//myactions.moveToElement(menMenu).clickAndHold().build().perform();;
		myactions.dragAndDropBy(menMenu, maxoffsert, 0).build().perform();
		myactions.moveToElement(menMenu).build().perform();
		myactions.dragAndDropBy(menMenu, -maxoffsert, 0).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(".//li/a[text()='Vertical slider']")).click();
		int maxoffsertinvertical = driver.findElement(By.xpath("")).getSize().height;
		//myactions.moveToElement(menMenu).clickAndHold().build().perform();;
		myactions.dragAndDropBy(menMenu, 0, maxoffsertinvertical).build().perform();
		//myactions.moveToElement(menMenu).build().perform();
		//myactions.moveToElement(menMenu).build().perform();
		//WebDriverWait wait= new WebDriverWait(driver,4,400);
			

		
		//Alert myalert = driver.switchTo().alert();
		//System.out.println(myalert.getText());
		//myalert.accept();
		
		

	}

}
