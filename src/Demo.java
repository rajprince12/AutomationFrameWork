import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {
static
{
	System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
}
public static void main(String[] args) {
	WebDriver drv = new InternetExplorerDriver();
	WebDriver drv1 = new ChromeDriver();
	WebDriver drv2 = new FirefoxDriver();
	drv.get("https://www.facebook.com");
	drv1.get("https://www.facebook.com");
	drv2.get("https://www.facebook.com");
}
}
