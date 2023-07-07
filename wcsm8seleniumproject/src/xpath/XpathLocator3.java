package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathLocator3 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.airasia.co.in/home");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'PN')]")).sendKeys("PNQ");
	Thread.sleep(2000);
    driver.findElement(By.xpath("//div[contains(text(),'COK')]")).sendKeys("COK");
	Thread.sleep(2000);
    driver.findElement(By.xpath("//div[contains(text(),'Special Fares')]")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//img[@alt='minus'and@id='student']"));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Done']")).click();

	}

}
