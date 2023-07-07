package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://cpanigra-kpmx3:8080/login.do");
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	        driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[.='Settings']/following-sibling::img")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
	        
	        driver.findElement(By.xpath("//input[@id='useDefaultLogoOption']")).click();
	        
	       WebElement target = driver.findElement(By.xpath("//input[@id='useDefaultReportLogoOption']"));
	       Actions act=new Actions(driver);
	       Thread.sleep(2000);
	       act.doubleClick(target).perform();
	       Thread.sleep(2000);
	       driver.quit();
	}

}
