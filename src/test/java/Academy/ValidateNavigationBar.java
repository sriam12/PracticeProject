package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;



public class ValidateNavigationBar extends Base {

	@BeforeTest
	public void Before() throws IOException{
		driver= initializeDriver();
		driver.get(pr.getProperty("url"));
	}
	@Test
	public void basepageNavigate() throws IOException{
		
		//TO Access methods in other classes 2 methods
		//1. inheritance
		//2.to create object to that particular class and invoke
		
		LandingPage l = new LandingPage(driver);
		//l.getlogin().click(); // driver.findelement(Bycss());
		
		Assert.assertEquals(l.Title().getText(), "FEATURED COURSES");
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		
		
	}
	@AfterTest
	public void tearDown(){
		driver.close();
	}
		
}
