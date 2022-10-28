package OrangrHRMsPractiseTestsOptimised;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import OrangeHRMSPages.HomePage;
import OrangeHRMSPages.LoginPage;
import Utilities.TestBase;

public class DeletingSingleUserTC11 
{
	public WebDriver driver;
	
	@Test
	public  void deletingSingleUserTC11() throws  InterruptedException 
	{
		TestBase tb=  new TestBase();
		driver = tb.openBrowser();
		
		LoginPage  lp = new LoginPage(driver);
		lp.OpenAppl();
		
		HomePage hp = new HomePage(driver);
		hp.HomePage_Displayed();	
		
		hp.navigate_Admin();
		
		System.out.println("ends");

	}

}
