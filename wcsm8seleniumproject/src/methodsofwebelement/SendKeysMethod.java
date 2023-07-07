package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendKeysMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://cpanigra-kpmx3:8080/login.do");
		WebElement usernametextbox = driver.findElement(By.xpath("//input[@name='username']"));
		usernametextbox.sendKeys("admin");
       WebElement passwordtextbox = driver.findElement(By.xpath("//input[@type='password']"));
       passwordtextbox.sendKeys("manager");
       WebElement button = driver.findElement(By.xpath("//a[@id='loginButton']"));
       button.click();
       driver.navigate().refresh();
       usernametextbox.sendKeys("admin123");
       passwordtextbox.sendKeys("123445133");
       button.click();
       



	}

}
