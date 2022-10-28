package OrangeHRMSPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	// 1. Declare elements
	public WebDriver driver;
	
	@FindBy(name= "username")
	public WebElement userName_Txtbox;
	
	@FindBy(name="password")
	public WebElement password_Txtbox;
	
	@FindBy(xpath = "//button")
	public WebElement login_Btn;

	// 2 constr
	public  LoginPage(WebDriver driver)
	{
//		userName_Txtbox = driver.findElement(By.name("username"));
//		password_Txtbox = driver.findElement(By.name("password"));
//		login_Btn = driver.findElement(By.xpath("//button"));
		PageFactory.initElements(driver, this);
		this.driver =driver;
	}

	// 3 Utilisation
	public void enter_userName(String val)
	{
		System.out.println("Enter username =" + val);
		userName_Txtbox.sendKeys(val);
	}

	public void enter_Password(String val)
	{
		System.out.println("Enter password =" + val);
		password_Txtbox.sendKeys(val);
	}

	public void click_LoginBtn()
	{
		login_Btn.click();
	}
	
	
	public void  OpenAppl() throws InterruptedException
	{	
//		Username : Admin
		//		Password : admin123
		enter_userName("Admin");
		enter_Password("admin123");

		// click Login button
		login_Btn.click();
		
	}
	

	
	

}
