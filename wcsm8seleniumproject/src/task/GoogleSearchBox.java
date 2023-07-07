package task;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("poha");
		Thread.sleep(2000);
	   List<WebElement> pohaOptions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
			//for(int i=1;i<pohaOptions.size();i++)
		//	{
			     //  String poha = pohaOptions.get(i).getText();
			     //  System.out.println(poha);
			     //  Thread.sleep(2000);
			//}
		//for each loop
			for(WebElement poha:pohaOptions)
			{
				System.out.println(poha.getText());
				Thread.sleep(2000);

			}
			

	}

}
