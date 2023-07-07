package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartwindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(" samsung 5g mobiles");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		String wh1 = driver.getWindowHandle();//handle of parent window
        driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F14 5G (GOAT Green, 128 GB)'][1]")).click();//child window
		Thread.sleep(2000);
		Set<String> allwin = driver.getWindowHandles();
		for (String wh : allwin) {
			if(!wh1.equals(allwin))
			{
				Thread.sleep(2000);

				driver.switchTo().window(wh);
			}
		}
        WebElement sto = driver.findElement(By.xpath("//a[.='4 GB']"));
		Point point = sto.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(" + xaxis + "," + (yaxis - 900) + ")");
		Thread.sleep(2000);

		sto.click();
		driver.findElement(By.id("pincodeInputId")).sendKeys("761119");
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();

		WebElement remv = driver.findElement(By.xpath("//div[@class='_3dsJAO' and  text()='Remove']"));
		Point point1 = remv.getLocation();

		int xaxis1 = point1.getX();
		int yaxis1 = point1.getY();
		jse.executeScript("window.scrollBy(" + xaxis1 + "," + (yaxis1 + 500) + ")");
		remv.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();

	}

}
