package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneIframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='fc_widget']"));
		driver.switchTo().frame(frame1);
		WebElement chat = driver.findElement(By.id("chat-icon"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(chat)).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chat-fc-name")).sendKeys("raj");
		driver.findElement(By.id("chat-fc-email")).sendKeys("raj123@gmail.com");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("9861327977");



	}

}
