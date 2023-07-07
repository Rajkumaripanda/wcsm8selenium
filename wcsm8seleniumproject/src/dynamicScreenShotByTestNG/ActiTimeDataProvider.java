package dynamicScreenShotByTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActiTimeDataProvider {
	static WebDriver driver;
  @BeforeTest
  public void property() {
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
  @DataProvider(name="testActiTime")
  public Object [][] dataprovider()
  {
	  Object [][]dataprovider=new Object[5][2];
	  dataprovider[0][0]="Admin";
	  dataprovider[0][1]="Manager";
	  
	  dataprovider[1][0]="Admin123";
	  dataprovider[1][1]="Manager123";
	  
	  dataprovider[2][0]="Admi_n";
	  dataprovider[2][1]="Mana_ger";
	  
	  dataprovider[3][0]="Adm&in";
	  dataprovider[3][1]="Manag%r";
	  
	  dataprovider[4][0]="manager";
	  dataprovider[4][1]="Admin";
	  
	  return dataprovider;



  }
  @Test(dataProvider="testActiTime")
  
	public void loginInvalid(String usn,String pass) throws InterruptedException  
	{
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usn);
      driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[@id='loginButton']")).click();
      Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='username']")).clear();
	}
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }


  
}
