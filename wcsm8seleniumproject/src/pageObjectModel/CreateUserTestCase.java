package pageObjectModel;

import java.io.IOException;

public class CreateUserTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		Thread.sleep(2000);

		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readPropertyData(EXCEL_PATH, "username"), flib.readPropertyData("./data/ActitimeTestdata (3).xlsx", "password"));
		HomePage hp = new HomePage(driver);
		hp.usersModuleMethod();
		UsersModule usm = new UsersModule(driver);
		String usn = flib.readExcelData(EXCEL_PATH,"createuser",1, 0);
		String pass = flib.readExcelData(EXCEL_PATH,"createuser",1, 1);
		String Fn = flib.readExcelData(EXCEL_PATH,"createuser",1, 2);
		String Ln = flib.readExcelData(EXCEL_PATH,"createuser",1,3);
		
		Thread.sleep(2000);
		usm.CreateUserMethod(usn, pass, Fn, Ln);
		//Thread.sleep(2000);
		//usm.DeleteUserMethod();
		

	}

}
