package dynamicScreenShotByTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNG {
  
  static WebDriver driver;
	@BeforeTest
	public void property()
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}

	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://cpanigra-kpmx3:8080/login.do");
	
		
	}
	
	@Test(alwaysRun = true)
	public void login()
	{
		
		String actualLoginPageTitle = driver.getTitle();
		// apply soft assert
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualLoginPageTitle,"idontknow");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");

		WebElement loginButton = driver.findElement(By.id("loginButton"));

		// apply hard Assert

		if (loginButton.isDisplayed()) 
		{
			Assert.assertEquals(true,true);	
			loginButton.click();
		}

		else
		{
			Reporter.log("Exception!!",true);
		}

		String actualHomePageTitle = driver.getTitle();

		Assert.assertEquals(actualHomePageTitle,"actiTIME - Enter Time-Track");

		driver.findElement(By.linkText("Logout")).click();
		
		sa.assertAll();
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
