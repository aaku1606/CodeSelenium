package mytestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class SecondTest {
	
	WebDriver driver;
  @Test(dataProvider="getData")
  public void Login(String user , String pwd,boolean rememberMe) {
	
	  driver.findElement(By.xpath("//input[@id='login1']")).sendKeys(user);
	  driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys(pwd);
	  if(driver.findElement(By.id("remember")).isSelected() == rememberMe)
		  System.out.println("checked");
	  else
		  driver.findElement(By.id("remember")).click();
	  driver.findElement(By.xpath("//input[@value = 'Go']")).click();
	  WebElement msg = driver.findElement(By.xpath("//div[@class='heading']/div")); 
	  Assert.assertEquals(msg.getText(),"Wrong username and password combination.");
	  
	
	              
  }
	@DataProvider
	public Object[][] getData(){
		// rows - number of time test has to be repeat ed
		// cols - number of parameters in test data
		Object[][] data = new Object[3][3];
		// 1st row
		data[0][0] = "xyz@gmail.com";
		data[0][1] = "pwd";
		data[0][2] = true;
			// 2nd row 
		data[1][0] = "abc@gmail.com";
		data[1][1] = "pwd";	
		data[1][2] = false;
		
		data[2][0] = "ttt@gmail.com";
		data[2][1] = "pwd";
		data[2][2] = true;
		return data;		
	}
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\I342079\\Downloads\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
