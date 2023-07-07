package windowbasepopup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ilovepdf.com/");
		driver.findElement(By.xpath("//a[.='Split PDF']")).click();
		driver.findElement(By.xpath("//span[.='Select PDF file']")).click();
		Thread.sleep(2000);
		File file = new File("./fileUpload/fileUpload2.exe");
		String abs = file.getAbsolutePath();
		Runtime.getRuntime().exec(abs);


	}

}
