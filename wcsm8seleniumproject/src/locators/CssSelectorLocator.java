package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.findElement(By.name("username")).sendKeys("rajkumari");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("raj1234");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();

	}

}
