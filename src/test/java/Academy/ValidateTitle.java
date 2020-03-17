package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;



public class ValidateTitle extends Base {

	
	@Test
	public void basepageNavigate() throws IOException{
		
		driver= initializeDriver();
		driver.get("http://qaclickacademy.com");
		//TO Access methods in other classes 2 methods
		//1. inheritance
		//2.to create object to that particular class and invoke
		
		LandingPage l = new LandingPage(driver);
		//l.getlogin().click(); // driver.findelement(Bycss());
		
		Assert.assertEquals(l.Title().getText(), "FEATURED COURSES");
		
		
	}
	@AfterTest
	public void tearDown(){
		driver.close();
	}
		
}
