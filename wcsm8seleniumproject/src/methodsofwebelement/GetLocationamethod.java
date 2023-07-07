package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetLocationamethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/downloads/");
		 WebElement value = driver.findElement(By.xpath("//h1[text()='Downloads']"));
		// System.out.println(value.getLocation());
		Point loc = value.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		System.out.println("x axis :"+ xaxis +",y axis:"+ yaxis    );

	}

}
