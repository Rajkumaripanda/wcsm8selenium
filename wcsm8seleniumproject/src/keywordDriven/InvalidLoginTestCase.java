package keywordDriven;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib flib = new Flib();
		int rc = flib.rowcount(EXCEL_PATH,"invalidinput");

		for(int i=1;i<=rc;i++)
		{
		String invalidusername = flib.readExcelData(EXCEL_PATH, "invalidinput", i, 0);
		String invalidpassword = flib.readExcelData(EXCEL_PATH, "invalidinput", i, 1);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(invalidusername);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(invalidpassword);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.findElement(By.name("username")).clear();
	
		



		}
		bt.closeBrowser();



	}
	

}
