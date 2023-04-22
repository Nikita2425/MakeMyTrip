

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Login_page_MMT 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//To open a chrome Browser
		
		System.setProperty("WebDriver.Chrome.driver","C:\\Users\\shri\\eclipse-workspace\\MakeMyTrip\\Browsers\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
		
		
		/*@FindBy(xpath="//a[@id='webklipper-publisher-widget-container-notification-close-div']")  private WebElement Closepopup;
		
		@FindBy(xpath="//li[@data-cy='account']")  private WebElement LoginButton;
		
		@FindBy(xpath="//input[@id='username']") private WebElement Email;
		
		@FindBy(xpath="//button[@class='capText font16']") private WebElement ContinueButtom;
		
	    @FindBy(xpath="//input[@id='password']") private WebElement Password;
		
	    @FindBy(xpath="//button[@class='capText font16']") private WebElement clickLogin;
		
	    @FindBy(xpath="//span[@data-cy='modalClose']") private WebElement closeMV;
		
		*/
		
		
		
	}
	
	
	
	

}
