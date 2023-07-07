package methodsofWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
				
     WebDriver driver = new FirefoxDriver();
     driver.manage().window().maximize();
     driver.get("https://www.google.com");
     driver.switchTo().activeElement().sendKeys("java");
 	Thread.sleep(2000);

    List<WebElement> list = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
    
    for(int i=1;i<list.size();i++)
    {
    	String java = list.get(i).getText();
    	System.out.println(java);
    	
    	Thread.sleep(2000);
    	
    	
    }
    	
    
     

	}

}
