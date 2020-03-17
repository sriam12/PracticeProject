package Academy;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObject.LandingPage;
import pageObject.LoginPage;



public class Homepage extends Base {

	@BeforeMethod
	public void initialize() throws IOException{
		driver= initializeDriver();
		driver.get("http://qaclickacademy.com");
	}
	
	@Test(dataProvider="getData")
	public void basepageNavigate(String Username,String password,String text) throws IOException{
		
		
		//TO Access methods in other classes 2 methods
		//1. inheritance
		//2.to create object to that particular class and invoke
		
		LandingPage l = new LandingPage(driver);
		l.getlogin().click(); // driver.findelement(Bycss());
		
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassowrd().sendKeys(password);
		System.out.println(text);
		lp.getLogin().click();
		
	}
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
		@DataProvider
		public Object[][] getData(){
			//row stands for how many different data type tests should run
			//Column stands for how many values for each test
			
			//Array Size 2
			//0,1
		Object[][] data = new Object[2][3];
		//0 row
		data[0][0] = "visual@mail.com";
		data[0][1] = "Gatti";
		data[0][2] = "text1";
		//1 row
		data[1][0] = "visual1@mail.com";
		data[1][1] = "Gatti1";
		data[1][2] = "text2";               
	    
		return data;
		
	}
}
