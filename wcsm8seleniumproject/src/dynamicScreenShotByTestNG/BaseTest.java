package dynamicScreenShotByTestNG;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class BaseTest {
 
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
 	  public void failedMethodToTakesScreenShot(String failedMethod)
	  {
		  try {
		  TakesScreenshot ts = (TakesScreenshot)driver;
		  File src = ts.getScreenshotAs(OutputType.FILE);
		  File dest = new File("./ScreenShot/"+failedMethod+".png");
		  Files.copy(src, dest);
		  }
		  
		  catch(Exception e)
		  {
			  
		  }
	  }
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
