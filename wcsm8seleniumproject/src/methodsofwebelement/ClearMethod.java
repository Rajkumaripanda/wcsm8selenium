package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://cpanigra-kpmx3:8080/login.do");
		WebElement usernametextbox = driver.findElement(By.xpath("//input[@name='username']"));
	    WebElement passwordtextbox = driver.findElement(By.xpath("//input[@type='password']"));
		usernametextbox.sendKeys("admin");
		passwordtextbox.sendKeys("manager");
		Thread.sleep(2000);
       usernametextbox.clear();
		Thread.sleep(2000);
       passwordtextbox.clear();
       
       


	}

}
