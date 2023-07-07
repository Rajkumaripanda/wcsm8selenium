package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HotstarLoginpage {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.hotstar.com/in/subscribe/sign-in"); 
	Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='phoneNo']")).sendKeys("9861327977");
	Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class='submit-button']")).click();
	

	}

}
