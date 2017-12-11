import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page {
	@FindBy(id="username")
	private WebElement Untb;

	public page(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	public void setusername(String un)
	{
	Untb.sendKeys(un);
	}
}
