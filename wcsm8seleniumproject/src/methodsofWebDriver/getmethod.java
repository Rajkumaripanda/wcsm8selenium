package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getmethod {
//is use to launch the WebApplication
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		
         //ChromeOptions co = new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");
		       //WebDriver driver = new ChromeDriver(co);
            WebDriver driver  = new FirefoxDriver();
		       driver.manage().window().maximize();
		       Thread.sleep(2000);
		       driver.get("http://omayo.blogspot.com/");
		       driver.close();
		       
	
	

	}

}
