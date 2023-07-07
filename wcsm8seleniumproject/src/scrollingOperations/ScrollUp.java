package scrollingOperations;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,350)");//scrolldown
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-350)");//scrollup
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(500,0)");//scrollleft
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(-500,0)");//scrollright
		

	}

}
