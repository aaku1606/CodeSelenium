package Day2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lesstnanvalues {
	
	public static void main(String args[])
	{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\I342079\\Downloads\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
	List<WebElement> elements = driver.findElements(By.xpath("//table[@class = 'dataTable']//td//following-sibling::td//following-sibling::td//following-sibling::td[contains(text(),',')]/ancestor::tr//a[text()]"));
	Iterator<WebElement> it = elements.iterator();
		while(it.hasNext())
			System.out.println(it.next().getText());
		
	}

}
