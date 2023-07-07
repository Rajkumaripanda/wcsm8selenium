package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathLocator2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://in.puma.com/in/en");
    
    driver.findElement(By.xpath("//span[text()='Men']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='PUMA White-Archive Green-PUMA Gold']")).click();
    Thread.sleep(2000);
    driver.quit();
    
	
}
}
