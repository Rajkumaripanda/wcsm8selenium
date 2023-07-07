package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;


public class ScreenShotOfWebElemnet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/accounts/login/");
		WebElement button = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		if(button.isEnabled())
		{
			System.out.println("we can do the login ..");
			
		}
		else
		{
			System.out.println("we can not do the login,ss is taken.");
			File src = button.getScreenshotAs(OutputType.FILE);
			File dest = new File("./ScreenShot/ss6.png");
			Files.copy(src, dest);
		}


	}

}
