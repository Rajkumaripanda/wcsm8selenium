package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver  = new FirefoxDriver();
      driver.get("https://www.google.com/");
      driver.switchTo().activeElement().sendKeys("phoebe Buffay",Keys.ENTER);
      Thread.sleep(2000);
      driver.findElement(By.className("lNPNe")).click();
      
	}

}
