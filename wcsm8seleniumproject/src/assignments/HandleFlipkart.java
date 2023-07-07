package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFlipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(" samsung s23 ultra");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		String pwh = driver.getWindowHandle();
        Thread.sleep(2000);

		driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)']")).click();
		Set<String> allhandle = driver.getWindowHandles();
		for(String wh:allhandle)
		{
			if(!pwh.equals(allhandle))
			{
				driver.switchTo().window(wh);//transfer the control to child window
			}
		}
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
        Thread.sleep(2000);

		WebElement target = driver.findElement(By.xpath("//span[.='View Details']"));//scroll particular webelement
		Point point = target.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
        Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='_2C41yO']/ancestor::li[@id='swatch-0-color']")).click();
		driver.findElement(By.xpath("//a[@class='_1fGeJ5']")).click();
        driver.findElement(By.id("pincodeInputId")).sendKeys("761119");
        driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
        Thread.sleep(2000);
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
