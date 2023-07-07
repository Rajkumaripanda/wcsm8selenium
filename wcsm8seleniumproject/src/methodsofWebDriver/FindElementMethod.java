package methodsofWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://cpanigra-kpmx3:8080/login.do");
		Thread.sleep(2000);
		WebElement usernametextbox = driver.findElement(By.name("username"));
		   usernametextbox.sendKeys("admin");
		System.out.println(usernametextbox);
		

	}

}
