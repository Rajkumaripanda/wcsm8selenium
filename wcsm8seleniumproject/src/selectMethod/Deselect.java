package selectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/cpanigra/Desktop/web%20Element/multiselect.html");
		WebElement dropdown2 = driver.findElement(By.name("menu"));
		Select sel=new Select(dropdown2);
		//to select multiple option
		for(int i=0;i<5;i++)
		{
			if(i%2==0)
			{  Thread.sleep(2000);
			   sel.selectByIndex(i);
		     
			}
			else
			{
				System.out.println("it is a odd place");
			}
			
			
		}
		//deselect the options
		for(int i=0;i<5;i++)
		{
			if(i%2==0)
			{
				sel.deselectByIndex(i);
			}
			else
			{
				System.out.println("it's odd place");
			}
		}
		
		

	}

}
