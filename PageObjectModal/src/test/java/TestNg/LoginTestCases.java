package TestNg;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPageObjects;
import PageObjects.ReadProperty;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTestCases 
{
	
		WebDriver driver = new FirefoxDriver();
		LoginPageObjects page ;
	    ReadProperty read ; 
	 
		public LoginTestCases() throws FileNotFoundException
		 {
			 read = new ReadProperty();
		 }
		
	
		@BeforeMethod //(alwaysRun = true)
		  public WebDriver openBrowser() throws IOException 
		    {
			driver.get(ReadProperty.getURL());
			driver.manage().window().maximize();  
			return driver;
		    }
		
	
		@Test
		  public void verifyLoginTest_1() throws IOException 
		  
			  {
			  
				 	page = new LoginPageObjects(driver);
				 	page.enterUserName();
					page.enterPassword();
					page.enterLogIn();
					page.getMgrID();
			  }
		
		@Test
		  public void verifyLogin_INVPD() throws IOException, InterruptedException  
		  
			  {
		
				page = new LoginPageObjects(driver);
				page.enterUserName();
				page.enterInvalidPassword();
				page.enterLogIn();
				
				driver.switchTo().alert();;
				String errorMsg = driver.switchTo().alert().getText();
				if(errorMsg.contains("User or Password is not valid"))
					{
						System.out.println("Expected error message");
					}
				else
					{
					System.out.println("This error msg is not expected");
					}
				driver.switchTo().alert().accept();
		  }			
		
		@Test
		  public void verifyLogin_INVUN() throws IOException, InterruptedException  
		  
			  {
		
				page = new LoginPageObjects(driver);
				page.enterUserName();
				page.enterInvalidUserName();
				page.enterLogIn();
				
				driver.switchTo().alert();;
				String errorMsg = driver.switchTo().alert().getText();
				if(errorMsg.contains("User or Password is not valid"))
					{
						System.out.println("Expected error message");
					}
				else
					{
					System.out.println("This error msg is not expected");
					}
				driver.switchTo().alert().accept();
			  }			
		
//		@AfterTest
//		  public void after() throws IOException 
//		  
//		  {
//			  
//			  driver.close();
//			 
//		  }
		
		
}
