package dataDriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidLoginActime extends Flib {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://cpanigra-kpmx3:8080/login.do");
		//to read the data from Flib class
		Flib flib = new Flib();
		String validusername = flib.readExcelData("./data/ActitimeTestdata.xlsx", "validinput", 1, 0);
		String validpassword = flib.readExcelData("./data/ActitimeTestdata.xlsx", "validinput", 1, 1);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(validusername);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(validpassword);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		driver.quit();


	}

}
