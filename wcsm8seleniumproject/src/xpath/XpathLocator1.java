package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathLocator1 {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new FirefoxDriver();
     driver.manage().window().maximize();
     driver.get("https://www.airindia.in/");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune, Lohegaon Airport, PNQ, India, IN");
     driver.findElement(By.xpath("//input[@id='to']")).sendKeys("Kochi, Cochin International Airport, COK, India, IN");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@value='Departing']")).click();
     Thread.sleep(2000);

     driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();
     

	}

}
