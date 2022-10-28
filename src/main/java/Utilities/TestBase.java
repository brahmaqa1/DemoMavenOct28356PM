package Utilities;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase 
{
	public static WebDriver driver;
	public static WebDriverWait wait =  new WebDriverWait(driver, 20);
	public static Logger  log =Logger.getLogger("devpinoyLogger");
	
	
	public WebDriver openBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
//		WebDriver driver  = new ChromeDriver();
		 driver  = new ChromeDriver();

		// open given url ib browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		return driver;
	}
	
	
	
	
	
}
