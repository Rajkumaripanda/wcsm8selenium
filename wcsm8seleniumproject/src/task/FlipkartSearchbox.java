package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartSearchbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(" hp Laptop");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);

        driver.findElement(By.xpath("//div[text()='Core i7']")).click();
		Thread.sleep(2000);

        driver.findElement(By.xpath("//div[text()='Brand' ]")).click();
		Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='_3879cV' and  text()='HP']")).click();
		Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and text()='Operating System']")).click();
		Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='_3879cV' and text()='Windows 11']")).click();
		Thread.sleep(4000);driver.findElement(By.xpath("//div[ text()='4★ & above']")).click();
        
       driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
        
		

	}

}
