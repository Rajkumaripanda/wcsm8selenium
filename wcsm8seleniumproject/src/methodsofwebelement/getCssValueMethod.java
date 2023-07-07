package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getCssValueMethod {

	public static void main(String[] args)
	{System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
	System.out.println(button.getCssValue("font"));
	System.out.println(button.getCssValue("color"));
	System.out.println(button.getLocation());
	
	

	}

}
