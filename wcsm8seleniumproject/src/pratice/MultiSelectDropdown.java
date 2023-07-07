package pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiSelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.cssscript.com/demo/multiselect-dropdown-list-checkboxes-multiselect-js/");
		driver.findElement(By.xpath("//label[@class='multiselect-dropdown-arrow']")).click();
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox.isSelected());
		WebElement item1 = driver.findElement(By.xpath("//span[.='Item 1']"));
		System.out.println(item1.isSelected());

	}

}
