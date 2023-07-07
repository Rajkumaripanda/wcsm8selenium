package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		WebElement target = driver.findElement(By.xpath("//a[@title='Coins']"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("//span[@data-p='gold-coins-22-weight-1gms,m']"));
		 WebElement coin = driver.findElement(By.xpath("//div[@class='mousetrap']"));//
		 if(coin.isDisplayed()) {
			 System.out.println("coin is displayed");
		 }
		 else
		 { System.out.println("exception");
			 
		 }
			 

		

	}

}
