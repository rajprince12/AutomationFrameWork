package script;

import generic.BaseTest;
import generic.Excel;
import pages.LoginPage;

public class InvalidLoginForMultipleinputs extends BaseTest {
	public void testInvalidLogin() throws InterruptedException
	{
		int rc=Excel.getRowCount(Xl_PATH, "InvalidLogin1");
		for(int i=1;i<=rc;i++)
		{
		
		String un = Excel.getCellValue(Xl_PATH, "InvalidLogin1", i, 0);
		String pw = Excel.getCellValue(Xl_PATH, "InvalidLogin1", i, 1);
		//Enter Invalid User Name
		LoginPage lp = new LoginPage(driver);
		lp.Setusername(un);
		//Enter Invalid Password
		lp.Setpassword(pw);
		//Click on Login
		lp.clickLogin();
		//Verify The Error MSG
		Thread.sleep(1000);
		lp.verifyErrMsgIsDisplayed(driver);
	}
}
}