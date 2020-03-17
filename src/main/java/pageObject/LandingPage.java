package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;

	public LandingPage(WebDriver driver){
		this.driver=driver;
	}
	
	

	By signin  = By.cssSelector("a[href*='sign_in']");
	    By title=   By.xpath("//div[@class='text-center']");
	    By navigationBar =   By.xpath("//a[contains(text(),'Contact')]");
	    
	
	public WebElement getlogin(){
		return driver.findElement(signin);
	}
	public WebElement Title(){
		return driver.findElement(title);
	}
	public WebElement getNavigationBar(){
		return driver.findElement(navigationBar);
	}
}
