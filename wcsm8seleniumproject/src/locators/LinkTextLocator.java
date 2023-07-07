package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextLocator {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/cpanigra/Desktop/web%20Element/link.html");
	driver.findElement(By.linkText("flipkart link")).click();

	}

}
