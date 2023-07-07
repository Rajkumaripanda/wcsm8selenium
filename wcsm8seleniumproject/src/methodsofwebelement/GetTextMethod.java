package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/accounts/login/");
		String button = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).getText();
		String link = driver.findElement(By.xpath("//a[text()='Forgot password?']")).getText();
        System.out.println(button);
        System.out.println(link);
	}

}
