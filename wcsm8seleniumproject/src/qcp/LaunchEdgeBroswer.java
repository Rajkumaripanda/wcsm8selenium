package qcp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBroswer {

	public static void main(String[] args) throws InterruptedException {
          WebDriver driver	=new EdgeDriver();
          driver.manage().window().maximize();
          Thread.sleep(2000);
          driver.close();
          

	}

}
