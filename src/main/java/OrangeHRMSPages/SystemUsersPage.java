package OrangeHRMSPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.TestBase;

//import Utilities.TestBase;

public class SystemUsersPage extends TestBase
{
	public static WebDriver driver;
	@FindBy(xpath = "//h5[text()='System Users']")
	public WebElement SystemUsers_Txt;
	
	@FindBy(xpath="//label[text()='User Role']/parent::div/following-sibling::div")
	public WebElement userRole_DropdownArrowBtn;
	
	@FindBy(xpath="")
	public WebElement t;
	
	public SystemUsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	public void verify_SystemUsersPageDisplayed()
	{
		
		if(SystemUsers_Txt.isDisplayed())
		{
			System.out.println("SystemUsersPage is displayed");
		}
		else
		{
			System.out.println("SystemUsersPage is not displayed");
		}		
	}
	
	// create new user

	
	@FindBy(xpath="//label[text()='User Role']/parent::div/following-sibling::div//div[@role='listbox']//*[text()='ESS']")
	public WebElement userRole_Dropdown;
	
	@FindBy(xpath="//label[text()='Status']/parent::div/following-sibling::div")
	public WebElement status_DropdownArrowBtn;
	
	@FindBy(xpath="//label[text()='Status']/parent::div/following-sibling::div//div[@role='listbox']//*[text()='Enabled']")
	public WebElement status_Dropdown;
	//label[text()='Employee Name']/parent::div/following-sibling::div//input
	
	
	
//	@FindBy(xpath="")
//	public WebElement t;
	
//	User_Search_Result_In_Global_Search_XPATH=//span[@title='%s']
	
	public void create_NewUser() throws InterruptedException
	{
		
		System.out.println("click Dropdown");
		userRole_DropdownArrowBtn.click();

		System.out.println(" Select 'Admin ' in litsbox");
		Thread.sleep(2000);
		
		userRole_Dropdown.click();
	

		System.out.println("Select Status");
		status_DropdownArrowBtn.click();
	
		status_Dropdown.click();

		System.out.println("Select Employee Name");
	
		driver.findElement(By.xpath("")).sendKeys("Orange");
		Thread.sleep(6000);
		

	
		int cnt=		driver.findElements(By.xpath("//div[@role='listbox']//*[text()='Orange  Test']")).size();

		System.out.println("cnt- " +  cnt);
		driver.findElements(By.xpath("//div[@role='listbox']//*[text()='Orange  Test']")).get(0).click();

		System.out.println("Select Username");
		//label[text()='Username']/parent::div/following-sibling::div//input

		String userName = "Rama2a1";
		driver.findElement(By.xpath("//label[text()='Username']/parent::div/following-sibling::div//input")).sendKeys(userName);

		System.out.println("Enter password");
		//label[text()='Password']/parent::div/following-sibling::div//input
		driver.findElement(By.xpath("//label[text()='Password']/parent::div/following-sibling::div//input")).sendKeys("Rama@123321");

		System.out.println("Enter Confirm Password");
		//label[text()='Confirm Password']/parent::div/following-sibling::div//input
		driver.findElement(By.xpath("//label[text()='Confirm Password']/parent::div/following-sibling::div//input")).sendKeys("Rama@123321");


		System.out.println("Click  Save button");
		//		driver.findElement(By.xpath("//button[@type='submit']")).click();//  nok

		WebElement  SaveBtn= driver.findElement(By.xpath("//button[@type='submit']"));
		//		WebElement  SaveBtn= driver.findElement(By.xpath("//button[text()='Save']"));
		System.out.println("SaveBtn =" + SaveBtn.isDisplayed());
		Actions act  = new Actions(driver);
		//		act.moveToElement(SaveBtn).click().perform(); // nok

		//		act.moveToElement(SaveBtn).doubleClick().perform();// nok

		JavascriptExecutor  js =  (JavascriptExecutor) driver;
		//		js.executeScript("arguments[0].click();", SaveBtn); // nok
		//		act.moveToElement(SaveBtn).sendKeys(Keys.ENTER).perform();
		//		act.keyDown(Keys.ENTER).build().perform();// nok
		Thread.sleep(5000);
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();// ok
		System.out.println("");		
		//  //div[@class='oxd-table-body']//div[@role='row']/div[2]/div[text()='Rama10']

		String myxpath = "//div[@class='oxd-table-body']//div[@role='row']/div[2]/div[text()='" + userName+ "']";
		boolean   userDisplayed =	 driver.findElement(By.xpath(myxpath)).isDisplayed();
		// scroll to user


		//act.scrollToElement(driver.findElement(By.xpath(myxpath))).perform();

		System.out.println("userDisplayed= " +userDisplayed);
		if(userDisplayed)
		{
			System.out.println("User name =" + userName + " created ");
		}
		else
		{
			System.out.println("User name =" + userName + "is not created ");
		}

	}
	
	
	// Select user 
	
	// open given user
	
	
	// Verify user details
	
//	
	


}
