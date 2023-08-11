package PageObjects;


import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPageObjects 
{
	public  ReadProperty read ;
	WebDriver driver;
	static String ErrorMsg ;
	
	By SignInbtn = By.xpath("//div[@class='m__button__cta']//button");
	By UserName = By.xpath("//input[@name='uid']");
	By Password = By.name("password");
	By EnterLogIn = By.name("btnLogin");
	By LoginErrorText = By.id("loginUsername.errors");
	By MgrId = By.xpath("((//tbody//tr)[5]//td)");
	LoginPageObjects() throws FileNotFoundException
	{
       read = new ReadProperty();
	}
	
	public LoginPageObjects (WebDriver driver) 
		{
			this.driver = driver;
		
		}
	
//	public void clickSignIn() throws IOException 
//		{
//			driver.findElement(SignInbtn).click(); 
//			
//		}
//	
	public void enterUserName() throws IOException 
		{
			driver.findElement(UserName).sendKeys(read.getUN());
			
		}
	
	public void getMgrID()
	{
		System.out.println(driver.findElement(MgrId).getText());
	}
	public void enterInvalidUserName() throws IOException 
	{
	 	
	 	
		driver.findElement(UserName).sendKeys(read.getINVUN());
		
	}
//		 
	 public void enterPassword() throws IOException 
		{
		 	//	driver.findElement(Password).click();
		 	
			driver.findElement(Password).sendKeys(read.getPD());
			
		}
	 public void enterInvalidPassword() throws IOException 
		{
		 	//	driver.findElement(Password).click();
		 	
			driver.findElement(Password).sendKeys(read.getINVPD());
			
		}
	 
	 public void enterLogIn() throws IOException 
		{
			driver.findElement(EnterLogIn).click(); 
			
		}
	
//	 public String getErrorMsg() throws IOException 
//		{
//		 	
//		 	
//		 //	ErrorMsg = driver.findElement(LoginErrorText).getText();
//			System.out.println("Error message shown  " +ErrorMsg);
//			return ErrorMsg;
//		}
	 
	 public void closeBrowser() throws IOException 
		{
		 	
			driver.close();
			System.out.println("test");		}
	
	 
}
