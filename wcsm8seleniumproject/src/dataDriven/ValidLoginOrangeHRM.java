package dataDriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidLoginOrangeHRM extends Flib {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Flib flib = new Flib();
		String validusername = flib.readExcelData("./data/orangeHRM.xlsx", "validinput", 1, 0);
		String validpassword = flib.readExcelData("./data/orangeHRM.xlsx","validinput" , 1, 1);
		driver.findElement(By.name("username")).sendKeys(validusername);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(validpassword);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
        driver.quit();
		


	}

}
