package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Staticwait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	     Thread.sleep(2000);//it will stop the execution of script for 2 secs.

		driver.get("https://www.instagram.com/accounts/login/");
	     Thread.sleep(4000);//it will stop the execution of script for 2 secs.
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("raj@789");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rkp123345666");
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();


	}

}
