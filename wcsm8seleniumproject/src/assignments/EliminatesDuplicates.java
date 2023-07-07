package assignments;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminatesDuplicates {

	public static void main(String[] args) {
		//by using tree set from dropdown
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/cpanigra/Desktop/web%20Element/multiselectD.html");
		WebElement dropdown = driver.findElement(By.name("menu"));
		Select sel=new Select(dropdown);
		List<WebElement> allops = sel.getOptions();
		// to eleminate duplicate values use treeset
		TreeSet<String> ts = new TreeSet<String>();
		//to read the list by duplicating values
		for(int i=0;i<allops.size();i++)
		{
			String op = allops.get(i).getText();
			ts.add(op);
		
		}
		//to read the options from treeset
		for(String options:ts)
		{
			System.out.println(options);
		}

	}

}
