package dataDriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvalidTestCaseOrangeHRM extends Flib {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Flib flib = new Flib();
		String invalidusername = flib.readExcelData("./data/orangeHRM.xlsx", "invalidinput", 1, 0);
		String invalidpassword = flib.readExcelData("./data/orangeHRM.xlsx","invalidinput" , 1, 1);
		driver.findElement(By.name("username")).sendKeys(invalidusername);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(invalidpassword);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
