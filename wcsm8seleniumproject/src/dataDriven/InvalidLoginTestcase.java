package dataDriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvalidLoginTestcase extends Flib  {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://cpanigra-kpmx3:8080/login.do");
		Flib flib = new Flib();
		int rc = flib.rowcount("./data/ActitimeTestdata.xlsx","invalidinput");
		for(int i=0;i<=rc;i++)
		{
			Thread.sleep(2000);

			String invalidusername = flib.readExcelData("./data/ActitimeTestdata.xlsx", "invalidinput", i, 0);
			WebElement usern = driver.findElement(By.xpath("//input[@name='username']"));
			usern. sendKeys(invalidusername);
			Thread.sleep(2000);
			usern.clear();
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			String invalidpassword = flib.readExcelData("./data/ActitimeTestdata.xlsx", "invalidinput", 1, 1);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(invalidpassword);
			Thread.sleep(2000);
		}

		
	}

}


