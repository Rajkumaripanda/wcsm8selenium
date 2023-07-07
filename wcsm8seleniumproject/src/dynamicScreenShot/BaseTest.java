package dynamicScreenShot;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	static WebDriver driver;
  @BeforeTest
  public void f() {
	  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
  }
  @BeforeMethod
  
  public void setup() {
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("");
  }

  
  public void failedMethod(String failedMethod) {
	  try
	  {
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 
		File file = ts.getScreenshotAs(OutputType.FILE);
		
		  
	  }
	  catch(Exception e)
	  {
		  
	  }
  }

  
  public void beforeTest() {
  }

}
