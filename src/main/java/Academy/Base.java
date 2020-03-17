package Academy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base {
	
	 public  WebDriver driver;
	 public Properties pr;
	public WebDriver initializeDriver() throws IOException{
		
		 pr = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\computer1\\E2EProject\\src\\main\\java\\Academy\\data.properties");
        pr.load(fis);
       String browserName = pr.getProperty("browser");
       System.out.println(browserName);
       
       if(browserName.equals("chrome")){
    	   System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
   		    driver = new ChromeDriver();
    	   
    	   
       }
       else if (browserName .contentEquals("firefox")){
    	   System.setProperty("webdriver.gecko.driver","C:\\Work\\geckodriver.exe" );
    	   driver = new FirefoxDriver();
       }
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       return driver;
	}

}
