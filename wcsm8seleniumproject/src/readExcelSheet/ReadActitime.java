package readExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadActitime {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
       driver.get("http://cpanigra-kpmx3:8080/login.do");
      // read the valid inputs of username from actitime testdata
       FileInputStream fis = new FileInputStream("./data/ActitimeTestdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validinput");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String validusername = cell.getStringCellValue();
		 FileInputStream fis2 = new FileInputStream("./data/ActitimeTestdata.xlsx");
			Workbook wb2 = WorkbookFactory.create(fis2);
			Sheet sheet2 = wb.getSheet("validinput");
			Row row2 = sheet.getRow(1);
			Cell cell2 = row.getCell(1);
			String validpassword = cell2.getStringCellValue();
       driver.findElement(By.xpath("//input[@name='username']")).sendKeys(validusername);// or not store in variable just send the path of excel sheet
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@type='password']")).sendKeys(validpassword);
       Thread.sleep(2000);

       driver.findElement(By.xpath("//a[@id='loginButton']")).click();
       Thread.sleep(2000);

       driver.quit();
	

	}

}
