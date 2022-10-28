package OrangrHRMsPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DeletingSingleUserTC11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();

		// open given url ib browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);


		//		Username : Admin
		//		Password : admin123
		driver.findElement(By.name("username")).sendKeys("Admin");

		driver.findElement(By.name("password")).sendKeys("admin123");

		// click Login button
		driver.findElement(By.xpath("//button")).click();

		boolean  res= 		driver.findElement(By.xpath("//img[@alt='profile picture']")).isDisplayed();

		if(res == true)
		{
			System.out.println("Home page is displayed succesfully");
		}

		else
		{
			System.out.println("Home page is not displayed ");
		}


		// TC2 :  create employee
		System.out.println("click Admin button");
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(5000);

		
		
		System.out.println("ends");

	}

}
