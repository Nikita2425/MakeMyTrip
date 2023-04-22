package LibraryFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	WebDriver driver;
	
	public void initialzeBrowser() throws InterruptedException
	{
	//To open a chrome Browser
	
	System.setProperty("WebDriver.Chrome.driver","C:\\Users\\shri\\eclipse-workspace\\MakeMyTrip\\Browsers\\chromedriver.exe");
	
	 driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.makemytrip.com/");
	
	Thread.sleep(2000);
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	
	}
}
