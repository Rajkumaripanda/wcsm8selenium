package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkdinloginpage {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("raj@456");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("qwee12233");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
