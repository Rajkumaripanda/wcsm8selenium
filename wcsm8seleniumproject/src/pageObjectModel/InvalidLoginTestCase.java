package pageObjectModel;

import java.io.IOException;

public class InvalidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		int rc = flib.rowcount(EXCEL_PATH,"invalidinput");

		for(int i=1;i<=rc;i++)
		{
		String invalidusername = flib.readExcelData(EXCEL_PATH, "invalidinput", i, 0);
		String invalidpassword = flib.readExcelData(EXCEL_PATH, "invalidinput", i, 1);
		lp.inValidLogin(invalidusername, invalidpassword);

		}
		bt.tearDown();

	}

}
