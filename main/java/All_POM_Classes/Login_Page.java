package All_POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibraryFile.UtilityClass;

public class Login_Page
{ 
	//POM 1
	
	//@FindBy(xpath="//a[@id='webklipper-publisher-widget-container-notification-close-div']")  private WebElement Closepopup;
	
	@FindBy(xpath="//li[@data-cy='account']")  private WebElement LoginButton;
	
	@FindBy(xpath="//input[@id='username']") private WebElement Email;
	
	@FindBy(xpath="//button[@class='capText font16']") private WebElement ContinueButtom;
	
    @FindBy(xpath="//input[@id='password']") private WebElement Password;
	
    @FindBy(xpath="//button[@class='capText font16']") private WebElement clickLogin;
	
    @FindBy(xpath="//span[@data-cy='modalClose']") private WebElement closeMV;
    
 
  //Step 2= initialize webelement  
    
    public  Login_Page(WebDriver driver)
    {
    	PageFactory.initElements(driver,this );
    	
    }
    
    //Step 3
   /*  public void Closebanner() 
    {
    	Closepopup.click();
    }
  */
    public void ClickonLogin() 
    {
    	LoginButton.click();
    }
  
    public void EnterEmail(String Value) 
    {
    	Email.sendKeys(Value);
    }
    public void Clickoncontinuebutton() 
    {
    	ContinueButtom.click();
    }
    
    public void EnterPassword(String Value) 
    {
    	Password.sendKeys(Value);
    }
    public void ClickonLoginbutton() 
    {
    	clickLogin.click();
    }
    
    public void clickonMV() 
    {
    	closeMV.click();
    	
    }
    
    
    
    
    
    
    
    
}
