package selectMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ismultipleandGetOptionsmethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/cpanigra/Desktop/web%20Element/link.html");
		WebElement dropdown = driver.findElement(By.name("MENU"));
		Select sel=new Select(dropdown);
		System.out.println(sel.isMultiple());//single select dropdown, output :false
		List<WebElement> alloptions = sel.getOptions();
		//for(int i=0;i<alloptions.size();i++)
		//{
			//String options = alloptions.get(i).getText();
		//	System.out.println(options);
		//}
		for(WebElement op:alloptions)//to read list use looping statement
		{
			String options = op.getText();
			System.out.println(options);
		}
		

	}

}
