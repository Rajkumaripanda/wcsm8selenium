package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActitimeLoginpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
       driver.get("http://cpanigra-kpmx3:8080/login.do");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
        driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	}

}
