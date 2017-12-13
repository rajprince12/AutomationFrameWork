package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pages.LoginPage;

public class InvalidLogin extends BaseTest {
@Test(priority=2,groups="login")
public void testInvalidLogin()
{
	String un = Excel.getCellValue(Xl_PATH, "InvalidLogin", 1, 0);
	String pw = Excel.getCellValue(Xl_PATH, "InvalidLogin", 1, 1);
	//Enter Invalid User Name
	LoginPage lp = new LoginPage(driver);
	lp.Setusername(un);
	//Enter Invalid Password
	lp.Setpassword(pw);
	//Click on Login
	lp.clickLogin();
	//Verify The Error MSG
	lp.verifyErrMsgIsDisplayed(driver);
}
}
