package pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		WebElement usernametextbox = driver.findElement(By.xpath("//input[@id='email']"));
		usernametextbox.sendKeys("raj1234");//sendkeys method
		WebElement login = driver.findElement(By.xpath("//button[@value='1']"));

                   login.click();//click method
                   usernametextbox.clear();//clear method
                   System.out.println(usernametextbox.getAttribute("class"));//get attribute method
                   System.out.println(login.getCssValue("color"));//getcss value method
	}

}
