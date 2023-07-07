package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		WebElement src1 = driver.findElement(By.xpath("//a[.=' BANK ']"));
		Thread.sleep(2000);
	    WebElement src2  = driver.findElement(By.xpath("//a[.=' 5000 ']"));
		WebElement src3 = driver.findElement(By.xpath("//a[.=' SALES ']"));
		 WebElement src4  = driver.findElement(By.xpath("//a[.=' 5000 ']"));
		 Thread.sleep(2000);
		 WebElement target1 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='bank']"));
		 WebElement target2 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='amt7']"));
		 WebElement target3 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='loan']"));
		 WebElement target4 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='amt8']"));
		 Actions act=new Actions(driver);
		 Thread.sleep(2000);
		 act.dragAndDrop(src1, target1).perform();
		 Thread.sleep(2000);
		 act.dragAndDrop(src2, target2).perform();
		 Thread.sleep(2000);
		 act.dragAndDrop(src3, target3).perform();
		 Thread.sleep(2000);
		 act.dragAndDrop(src4, target4).perform();
		 
		 

	}

}
