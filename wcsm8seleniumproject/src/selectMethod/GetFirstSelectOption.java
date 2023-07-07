package selectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectOption {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/cpanigra/Desktop/web%20Element/multiselect.html");
		WebElement dropdown = driver.findElement(By.name("menu"));
		Select sel=new Select(dropdown);
		for(int i=3;i<6;i++)
		{
			sel.selectByIndex(i);
			
		}
		WebElement firstoption = sel.getFirstSelectedOption();
		System.out.println(firstoption.getText());

	}

}
