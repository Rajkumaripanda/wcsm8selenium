package methodsofWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class managemethod {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
   WebDriver driver=new FirefoxDriver();
   driver.manage().window().maximize();
  Dimension targetsize = new Dimension(350, 450);
  
  driver.manage().window().setSize(targetsize);
  Thread.sleep(2000);
 Point targetposition = new Point(450,350);
 driver.manage().window().setPosition(targetposition);
 Thread.sleep(2000);
 driver.close();
  
  
  

  
	}

}
