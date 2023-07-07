package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pumastore100 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");


		WebDriver driver=new FirefoxDriver();


		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en/womens");
		driver.findElement(By.xpath("//h3[text()='Smashic Unisex Sneakers']/descendant::span[text()='PUMA Black-Matte Silver']"));
		driver.findElement(By.xpath("//span[text()='PUMA.com']/ancestor::a/following-sibling::button/descendant::span[text()='Menu']"));



	}

}
