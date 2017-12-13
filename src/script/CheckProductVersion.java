package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.EnterTimeTrackPage;
import pages.LoginPage;

public class CheckProductVersion extends BaseTest {
@Test(priority=3,groups="product")
public void testCheckProductVersion()
{
	//Enter user Name
	LoginPage lp = new LoginPage(driver);
	lp.Setusername("admin");
	//Enter Password
	lp.Setpassword("manager");
	//click on Login
	lp.clickLogin();
	//click on help
	EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
	e.clickHelp();
	//click on about your ActiTime
	e.clickAboutActiTIME();
	String eVersion="actiTIME 2017.4";
	//verify the product version
	e.verifyVersion(eVersion);
	//click on close Button
	e.clickClose();
	//click on logout
	e.clickLogout();
}

}
