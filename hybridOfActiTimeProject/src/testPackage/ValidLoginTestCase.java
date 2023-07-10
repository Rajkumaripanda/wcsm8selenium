package testPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListeners;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.TaskListPage;
import pagePackage.UsersPage;
@Listeners(CustomeListeners.class)
public class ValidLoginTestCase extends BaseTest {
	

	@Test
	public void validTestCase() throws IOException, InterruptedException
	{
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readPropertyData(PROP_PATH,"username"),flib.readPropertyData(PROP_PATH,"password"));
        Thread.sleep(2000);		
        HomePage hp = new HomePage(driver);
        hp.usersModuleMethod();
        
        UsersPage up = new UsersPage(driver);
        Thread.sleep(2000);
        up.CreateUserMethod(flib.readExcelData(EXCEL_PATH,"mgr",1,0), 
        		flib.readExcelData(EXCEL_PATH,"mgr",1,1),flib.readExcelData(EXCEL_PATH,"mgr",1,3)
        		,flib.readExcelData(EXCEL_PATH,"mgr",1,4));
       	
		
		Thread.sleep(4000);


		up.selectCheckBox();
		Thread.sleep(4000);

		up.managerCreateMethod();

		
		Thread.sleep(4000);
		hp.taskModuleMethod();
		TaskListPage task = new TaskListPage(driver);
		Thread.sleep(4000);

		task.createNewCustomerMethod(flib.readExcelData(EXCEL_PATH,"customers&projects",1,0));
		Thread.sleep(2000);
		task.createProjectMethod(0,flib.readExcelData(EXCEL_PATH,"customers&projects",1,1));
		
	}
}
