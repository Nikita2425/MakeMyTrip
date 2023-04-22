package TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import All_POM_Classes.Login_Page;
import LibraryFile.BaseClass;
import LibraryFile.UtilityClass;

public class TC_LoginToWebsite extends BaseClass
{
	Login_Page   L1;
	
	WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException 
	{
		initialzeBrowser();
		
		//create object of POM class
		L1=new Login_Page(driver);
		
	}
	
	@BeforeMethod
	public void  Logintowebsite() throws IOException, InterruptedException 
	{   //L1.Closebanner();
	    //Thread.sleep(2000);
		L1.ClickonLogin();
		Thread.sleep(2000);
		L1.EnterEmail(UtilityClass.FetchdataFromPF("EM"));
		Thread.sleep(2000);
		L1.Clickoncontinuebutton();
		Thread.sleep(2000);
		L1.EnterPassword(UtilityClass.FetchdataFromPF("PSW"));
		Thread.sleep(2000);
		L1.ClickonLoginbutton();
		Thread.sleep(2000);
		L1.clickonMV();
		
	}

	
	@Test
	public void Verifyusername() 
	{
		System.out.println("Successfuly Executed");
	}
	
	
	

}
