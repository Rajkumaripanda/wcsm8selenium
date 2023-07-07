package windowbasepopup;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Popup1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
       driver.get("http://cpanigra-kpmx3:8080/login.do");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
        driver.findElement(By.xpath("//a[@id='loginButton']")).click();
        Thread.sleep(2000);
        WebElement target = driver.findElement(By.xpath("//div[.='Settings']"));
        Actions act=new Actions(driver);
        Thread.sleep(2000);

        act.doubleClick(target).perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logoOption' and  @value='2']")).click();
       WebElement target1 = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
       act.doubleClick(target1).perform();
       
       File file= new File("./fileUpload/fileUpload.exe");
       String abs = file.getAbsolutePath();
       Runtime.getRuntime().exec(abs);

	}

}
