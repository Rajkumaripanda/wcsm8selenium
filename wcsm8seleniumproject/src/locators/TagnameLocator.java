package locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagnameLocator {

	public static void main(String[] args) throws InterruptedException {
            WebDriver driver  = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("file:///C:/Users/cpanigra/Desktop/web%20Element/link.html");
            driver.findElement(By.tagName("input")).sendKeys("admin");
            Thread.sleep(2000);
            driver.navigate().to("https://www.instagram.com/");
            
            driver.findElement(By.tagName("input")).sendKeys("raj");
            

	}

}
