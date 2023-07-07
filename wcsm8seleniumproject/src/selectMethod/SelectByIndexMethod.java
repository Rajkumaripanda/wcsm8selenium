package selectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/cpanigra/Desktop/web%20Element/link.html");
		//single select dropdown
		//WebElement dropdown = driver.findElement(By.name("MENU"));
		//Select sel = new Select( dropdown); 
		Thread.sleep(2000);
		//sel.selectByIndex(1);
		//sel.selectByValue("v1");
		//sel.selectByVisibleText("vadapav");
		//multi select dropdown
		WebElement dropdown = driver.findElement(By.name("MENU"));
		Select sel = new Select(dropdown);
		for(int i=0;i<5;i++)
		{
			sel.selectByIndex(i);
		}
		
		

	}

}
