package generic;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AUL {
public static String getproperty(String path,String key)
{
	String v=" ";
	try
	{
		//creating objects of properties
		Properties p = new Properties();
		//loading property file
		p.load(new FileInputStream(path));
		//get the property file
		v=p.getProperty(key);
	}
	catch(Exception e)
	{
		
	}
	return v;
}
public static void takephoto(String Folder,String Testname ,WebDriver driver )
{
	String dateTime = new Date().toString().replaceAll(":", "-");
	TakesScreenshot tc =(TakesScreenshot)driver;
	File SrcFile = tc.getScreenshotAs(OutputType.FILE);
	String Dstpath =Folder+Testname+dateTime+".png";
	try
	{
		FileUtils.copyFile(SrcFile, new File(Dstpath));
	}
	catch(Exception e)
	{
		
	}
}
}
