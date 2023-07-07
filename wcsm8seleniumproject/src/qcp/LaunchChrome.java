package qcp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
		
		
	   
	          WebDriver driver=new ChromeDriver();
		 
		       driver.manage().window().maximize();
		       
		      
		
       
	}

}
