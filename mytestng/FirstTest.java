package mytestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class FirstTest {
	
	@Ignore
	@Test
	public void anotherTest()
	{
		 System.out.println("AnotherTest test");
	}
  @Test(timeOut=1000)
  //(dependsOnMethods = "LoginTest")
  public void LoginTest() {
	  System.out.println("Login test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After test");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class  test");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class test");
  }

}
