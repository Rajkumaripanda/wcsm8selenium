package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal' and text()='Redmi 12C (Royal Blue, 4GB RAM, 64GB Storage)']")).click();
		
		driver.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
		driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();

	}

}
