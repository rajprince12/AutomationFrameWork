package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
public static  String getCellValue(String path,String Sheet,int r,int c)
{
	String s=" ";
	try
	{
		Workbook wb =WorkbookFactory.create(new FileInputStream(path));
		s=wb.getSheet(Sheet).getRow(r).getCell(c).toString();
	}
	catch(Exception e)
	{
		
	}
	return s;
}
public static int getRowCount(String path,String Sheet)
{
	int rc=0;
	try
	{
		Workbook wb =WorkbookFactory.create(new FileInputStream(path));
		rc=wb.getSheet(Sheet).getLastRowNum();
	}
	catch(Exception e)
	{
		
	}
	return rc;
}
}
