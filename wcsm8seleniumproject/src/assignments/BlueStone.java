 package assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		WebElement target = driver.findElement(By.xpath("//a[.='Watch Jewellery ']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[@title='Band']")).click();
	 WebElement src1 = driver.findElement(By.xpath("//div[text()='Filter by']"));
	 for(int i=0;i<=2;i++)
	 {
		 act.clickAndHold(src1).perform();
	 }
	 
	 Robot robot=new Robot();
	 robot.keyPress(KeyEvent.VK_CONTROL);
	 robot.keyPress(KeyEvent.VK_C);
	 
	 robot.keyRelease(KeyEvent.VK_CONTROL);
	 robot.keyRelease(KeyEvent.VK_C);
	 
	 driver.findElement(By.name("search_query")).click();
	 robot.keyPress(KeyEvent.VK_CONTROL);
	 robot.keyPress(KeyEvent.VK_V);
	 
	 robot.keyRelease(KeyEvent.VK_CONTROL);
	 robot.keyRelease(KeyEvent.VK_V);
	WebElement searchbox = driver.findElement(By.name("submit_search"));
	searchbox.submit();
	

	}

}
