package mytestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Core_DataProvider {
	
	@Test(dataProvider="getData")
	public void Login(String user , String pwd){
			System.out.println(user +" --- " + pwd);
			System.out.println("Hello world");}
	
	@DataProvider
	public Object[][] getData(){
		// rows - number of time test has to be repeat ed
		// cols - number of parameters in test data
		Object[][] data = new Object[3][2];
		// 1st row
		data[0][0] = "xyz@gmail.com";
		data[0][1] = "pwd";	
			// 2nd row 
		data[1][0] = "abc@gmail.com";
		data[1][1] = "pwd";	
		
		data[2][0] = "ttt@gmail.com";
		data[2][1] = "pwd";
		return data;		
	}
}
