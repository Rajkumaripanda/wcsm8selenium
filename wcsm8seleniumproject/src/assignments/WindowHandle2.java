package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle2 {

	public static void main(String[] args) throws InterruptedException {
		// close all the window without using quit method
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://omayo.blogspot.com/");

		WebElement link = driver.findElement(By.linkText("Open a popup window"));
		Point point = link.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
         jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
		Thread.sleep(2000);
		String parentHandle = driver.getWindowHandle();
        System.out.println("handle of parent window:" +parentHandle);
         link.click();
        Set<String> whs = driver.getWindowHandles();
        for(String allwin:whs)
        {
    		Thread.sleep(2000);

        	driver.switchTo().window(allwin).close();
        }

	}

}
