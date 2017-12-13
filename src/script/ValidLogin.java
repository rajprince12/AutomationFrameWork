package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pages.EnterTimeTrackPage;
import pages.LoginPage;

public class ValidLogin extends BaseTest {
@Test(priority=1,groups="smoke")
public void testValidLogin()
{
	//getting the data from Excel sheet
	String Sheet="ValidLogin";
	String un=Excel.getCellValue(Xl_PATH, Sheet, 1, 0);
	String pw=Excel.getCellValue(Xl_PATH, Sheet, 1, 1);
	String eTitle=Excel.getCellValue(Xl_PATH, Sheet, 1, 2);
	//Enter Valid User Name
	LoginPage lp = new LoginPage(driver);
	lp.Setusername(un);
	//Enter Valid Password
	lp.Setpassword(pw);
	//click on Login
	lp.clickLogin();
	//verify the Title of the HomePage
	EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
	e.verifyTitle(driver, eTitle);
}
}
