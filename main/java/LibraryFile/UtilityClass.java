package LibraryFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass
{
	//Automation Test Eng= Nikita
	//Date=17/4/23
	//Purpose=To fetch data from property file
	
	public static String FetchdataFromPF(String key) throws IOException 
	{
		FileInputStream File=new FileInputStream("C:\\Users\\shri\\eclipse-workspace\\MakeMyTrip\\propertyFile.propertires");
		
		Properties  pro=new  Properties();
		
		pro.load(File);
		
		String value=pro.getProperty(key);
		
		return value;
		
	}
	
	//Automation Test Eng= Nikita
    //Date=17/4/23
    //Purpose=To fetch data from Excel Sheet
	
	public static String FetchTestdata(int Rowindex, int Columnindex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream  File=new   FileInputStream("C:\\Users\\shri\\eclipse-workspace\\MakeMyTrip\\TestData\\Book123.xlsx");
		
	   Sheet  Sh=WorkbookFactory.create(File).getSheet("Sheet1");
		
	   String	Value1=Sh.getRow(Rowindex).getCell(Columnindex).getStringCellValue();
		
	   return Value1;
	}
	

}
