package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitActitime {

	public static void main(String[] args)  {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://cpanigra-kpmx3:8080/login.do");
		  System.out.println(driver.getTitle());
		  
		if (driver.getTitle().equals("actiTIME - Login"))
        {
			System.out.println(" login page title is matched and testcase passed");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			 System.out.println(driver.getTitle());
	    }
		else
		{
		  System.out.println(" login page title is not matched and testcase failed");
		}
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
		 if (driver.getTitle().equals("actiTIME - Enter Time-Track")) {
				System.out.println("title of homepage is matched and testcase passed");
			}
			 else
			 {
				 System.out.println("title of homepage is not matched and test case failed");
			 }
			

	}

}
