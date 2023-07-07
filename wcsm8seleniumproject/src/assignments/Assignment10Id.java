package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment10Id {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/Login");
		Thread.sleep(2000);
		driver.findElement(By.id("id_userLoginId")).sendKeys("abcd@123");
		Thread.sleep(2000);
		driver.findElement(By.id("id_password")).sendKeys("raj456");
		driver.findElement(By.xpath("//button[text()='sign in']")).click();
		

	}

}
