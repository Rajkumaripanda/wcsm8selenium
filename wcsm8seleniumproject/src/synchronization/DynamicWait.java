package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWait {
//implicitly wait
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://www.instagram.com/accounts/login/");
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("raj@789");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rkp123345666");
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();



	}

}
