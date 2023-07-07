package pratice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
        driver.findElement(By.xpath("//div[.='Electronics' and @class='xtXmba']")).click();
        WebElement target = driver.findElement(By.xpath("//span[@class='_2I9KP_' and text()='Electronics']"));
        Actions act=new Actions(driver);
        act.moveToElement(target).perform();
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("women dress");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
         String pwh = driver.getWindowHandle();
        WebElement drs = driver.findElement(By.xpath("//a[.='Women Fit and Flare Black Dress']"));
        Point point = drs.getLocation();
        int xaxis = point.getX();
        int yaxis = point.getY();
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-500)+")");
        
        drs.click();
       Set<String> allwh = driver.getWindowHandles();
       for(String wh:allwh)
       {
    	   if(!pwh.equals(allwh))
    	   {
    		   driver.switchTo().window(wh);
    	   }
       }
       Thread.sleep(2000);
       
        driver.findElement(By.xpath("//div[@class='_2C41yO _1pH70n _31hAvz']/ancestor::li[@id='swatch-0-color']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@class='_1fGeJ5 _2UVyXR _31hAvz']/ancestor::li[@id='swatch-0-size']")).click();
        Thread.sleep(2000);

        
        driver.findElement(By.xpath("//input[@placeholder='Enter delivery pincode']")).sendKeys("761119");
        driver.findElement(By.xpath("//span[.='Check']")).click();

	}

}
